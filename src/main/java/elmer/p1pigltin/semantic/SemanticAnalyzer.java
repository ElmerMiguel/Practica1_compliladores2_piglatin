package elmer.p1pigltin.semantic;

import elmer.p1pigltin.ast.AstNode;
import elmer.p1pigltin.core.CompilerError;
import elmer.p1pigltin.core.ErrorReporter;

import java.util.LinkedHashMap;
import java.util.Map;

public class SemanticAnalyzer {
    private final SymbolTable tabla;
    private final ErrorReporter errores;

    public SemanticAnalyzer(SymbolTable tabla, ErrorReporter errores) {
        this.tabla = tabla;
        this.errores = errores;
    }

    public void declararSimbolos(AstNode program) {
        if (program == null) return;
        switch (program.tipo) {
            case PROGRAM -> program.children.forEach(this::declararSimbolos);
            case VAR_DECL -> declararVariable(program);
            case ARRAY_DECL -> declararArray(program);
            case STRUCT_DEF -> declararStruct(program);
            case STRUCT_VAR_DECL -> declararStructVariable(program);
            default -> { }
        }
    }

    public void verificarTipos(AstNode program) {
        verificar(program);
    }

    private void declararVariable(AstNode node) {
        Type type = Type.fromName((String) node.attrs.get("tipoDeclarado"));
        if (type == null) {
            error(node, "Tipo no reconocido: " + node.attrs.get("tipoDeclarado"));
            return;
        }
        declarar(node, tabla.declarar((String) node.attrs.get("nombre"), type), "Variable ya declarada");
    }

    private void declararArray(AstNode node) {
        Integer size = constantInteger(node.children.get(0));
        String name = (String) node.attrs.get("nombre");
        String elementType = (String) node.attrs.get("tipoElemento");
        if (size == null || size < 0) {
            error(node, "El tamaño del arreglo debe ser un entero constante no negativo");
            return;
        }
        if (!isKnownType(elementType)) {
            error(node, "Tipo de elemento no definido: " + elementType);
            return;
        }
        declarar(node, tabla.declararArray(name, elementType, size), "Arreglo ya declarado");
    }

    private void declararStruct(AstNode node) {
        String name = (String) node.attrs.get("nombre");
        Map<String, SymbolTable.Field> fields = new LinkedHashMap<>();
        for (AstNode member : node.children) {
            String fieldName = (String) member.attrs.get("nombre");
            String fieldType = (String) member.attrs.get("tipoDeclarado");
            if (fields.containsKey(fieldName)) {
                error(member, "Atributo duplicado en " + name + ": " + fieldName);
            } else if (!isKnownType(fieldType)) {
                error(member, "Tipo de atributo no definido: " + fieldType);
            } else {
                fields.put(fieldName, new SymbolTable.Field(fieldName, fieldType,
                        Boolean.TRUE.equals(member.attrs.get("esArreglo"))));
            }
        }
        declarar(node, tabla.declararStruct(name, fields), "Estructura ya declarada");
    }

    private void declararStructVariable(AstNode node) {
        String structType = (String) node.attrs.get("tipoDeclarado");
        SymbolTable.Symbol typeSymbol = tabla.resolver(structType);
        if (typeSymbol == null || typeSymbol.kind() != SymbolTable.Kind.STRUCTURE) {
            error(node, "Tipo de estructura no definido: " + structType);
            return;
        }
        declarar(node, tabla.declararStructVariable((String) node.attrs.get("nombre"), structType),
                "Variable ya declarada");
    }

    private Type verificar(AstNode node) {
        if (node == null) return Type.VOID;
        return switch (node.tipo) {
            case PROGRAM -> { node.children.forEach(this::verificar); yield Type.VOID; }
            case VAR_DECL -> verificarDeclaracion(node);
            case ARRAY_DECL -> verificarArray(node);
            case STRUCT_DEF -> Type.VOID;
            case STRUCT_VAR_DECL -> verificarStructLiteral(node, (String) node.attrs.get("tipoDeclarado"));
            case STRUCT_FIELD_INIT -> verificarFieldOrArrayInit(node);
            case ASSIGN -> verificarAsignacion(node);
            case BINARY_EXPR -> verificarBinaria(node);
            case UNARY_EXPR -> verificar(node.children.get(0));
            case LITERAL -> Type.fromName((String) node.attrs.get("tipoLiteral"));
            case VAR_ACCESS -> verificarAcceso(node);
            case PRINT -> { node.children.forEach(this::verificar); yield Type.VOID; }
            default -> { node.children.forEach(this::verificar); yield Type.VOID; }
        };
    }

    private Type verificarDeclaracion(AstNode node) {
        Type declared = Type.fromName((String) node.attrs.get("tipoDeclarado"));
        if (!node.children.isEmpty()) {
            Type actual = verificar(node.children.get(0));
            if (!declared.accepts(actual)) {
                error(node, "La variable '" + node.attrs.get("nombre") + "' es " + declared
                        + " pero recibe una expresion de tipo " + actual);
            }
        }
        return declared;
    }

    private Type verificarArray(AstNode node) {
        Type elementType = Type.fromName((String) node.attrs.get("tipoElemento"));
        if (node.children.size() > 1) {
            for (AstNode value : node.children.get(1).children) {
                Type actual = verificar(value);
                if (elementType != null && !elementType.accepts(actual)) {
                    error(value, "Elemento incompatible en arreglo '" + node.attrs.get("nombre") + "'");
                }
            }
        }
        return Type.VOID;
    }

    private Type verificarAsignacion(AstNode node) {
        Type target = verificar(node.children.get(0));
        AstNode value = node.children.get(1);
        if (value.tipo == AstNode.Tipo.STRUCT_FIELD_INIT) {
            verificarStructLiteralForTarget(node.children.get(0), value);
            return Type.VOID;
        }
        Type actual = verificar(value);
        if (target != null && !target.accepts(actual)) {
            error(node, "Asignacion incompatible: " + target + " recibe " + actual);
        }
        return Type.VOID;
    }

    private Type verificarBinaria(AstNode node) {
        Type left = verificar(node.children.get(0));
        Type right = verificar(node.children.get(1));
        String operator = (String) node.attrs.get("operador");
        Type result = Type.resultOf(left, right, operator);
        if (result == null) error(node, "Operacion incompatible: " + left + " " + operator + " " + right);
        return result;
    }

    private Type verificarAcceso(AstNode node) {
        String name = (String) node.attrs.get("nombreBase");
        SymbolTable.Symbol symbol = tabla.resolver(name);
        if (symbol == null) {
            error(node, "Variable no declarada: " + name);
            return null;
        }
        String currentType = symbol.declaredType();
        Type currentPrimitive = symbol.type();
        for (AstNode step : node.children) {
            if (step.tipo == AstNode.Tipo.ACCESS_STEP_INDEX) {
                Integer index = constantInteger(step.children.get(0));
                if (index != null && symbol.kind() == SymbolTable.Kind.ARRAY
                        && (index < 0 || index >= symbol.size())) {
                    error(step, "Indice fuera de rango en '" + name + "': " + index);
                }
                currentType = symbol.elementType();
                currentPrimitive = Type.fromName(currentType);
            } else {
                String fieldName = (String) step.attrs.get("nombreCampo");
                SymbolTable.Symbol structure = tabla.resolver(currentType);
                if (structure == null || structure.kind() != SymbolTable.Kind.STRUCTURE
                        || !structure.fields().containsKey(fieldName)) {
                    error(step, "Atributo no definido: " + fieldName);
                    return null;
                }
                SymbolTable.Field field = structure.fields().get(fieldName);
                currentType = field.typeName();
                currentPrimitive = Type.fromName(currentType);
            }
        }
        return currentPrimitive;
    }

    private Type verificarStructLiteral(AstNode node, String structType) {
        SymbolTable.Symbol structure = tabla.resolver(structType);
        if (structure != null) verificarStructFields(node.children.get(0), structure);
        return Type.VOID;
    }

    private void verificarStructLiteralForTarget(AstNode target, AstNode literal) {
        String typeName = resolveAccessType(target);
        SymbolTable.Symbol structure = typeName == null ? null : tabla.resolver(typeName);
        if (structure != null) verificarStructFields(literal, structure);
    }

    private String resolveAccessType(AstNode access) {
        SymbolTable.Symbol symbol = tabla.resolver((String) access.attrs.get("nombreBase"));
        if (symbol == null) return null;
        String currentType = symbol.declaredType();
        for (AstNode step : access.children) {
            if (step.tipo == AstNode.Tipo.ACCESS_STEP_PROP) {
                SymbolTable.Symbol structure = tabla.resolver(currentType);
                if (structure == null) return null;
                SymbolTable.Field field = structure.fields().get(step.attrs.get("nombreCampo"));
                if (field == null) return null;
                currentType = field.typeName();
            } else if (symbol.kind() == SymbolTable.Kind.ARRAY) {
                currentType = symbol.elementType();
            }
        }
        return currentType;
    }

    private void verificarStructFields(AstNode literal, SymbolTable.Symbol structure) {
        Map<String, Boolean> seen = new LinkedHashMap<>();
        for (AstNode field : literal.children) {
            String name = (String) field.attrs.get("nombreCampo");
            SymbolTable.Field definition = structure.fields().get(name);
            if (definition == null) {
                error(field, "Atributo no definido en estructura: " + name);
                continue;
            }
            seen.put(name, true);
            Type actual = verificar(field.children.get(0));
            Type expected = Type.fromName(definition.typeName());
            if (expected != null && !expected.accepts(actual)) error(field, "Tipo incorrecto para atributo '" + name + "'");
        }
        for (String name : structure.fields().keySet()) {
            if (!seen.containsKey(name)) error(literal, "Falta valor para atributo: " + name);
        }
    }

    private Type verificarFieldOrArrayInit(AstNode node) {
        node.children.forEach(this::verificar);
        return Type.VOID;
    }

    private boolean isKnownType(String name) {
        return Type.fromName(name) != null || (tabla.resolver(name) != null
                && tabla.resolver(name).kind() == SymbolTable.Kind.STRUCTURE);
    }

    private Integer constantInteger(AstNode node) {
        if (node != null && node.tipo == AstNode.Tipo.LITERAL
                && "NUMERUS".equals(node.attrs.get("tipoLiteral"))) {
            return ((Number) node.attrs.get("valor")).intValue();
        }
        return null;
    }

    private void declarar(AstNode node, boolean success, String message) {
        if (!success) error(node, message + ": " + node.attrs.get("nombre"));
    }

    private void error(AstNode node, String message) {
        errores.report(new CompilerError(CompilerError.Fase.SEMANTICA, message, node.line, node.column));
    }
}
