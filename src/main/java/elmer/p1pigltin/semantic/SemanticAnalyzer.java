package elmer.p1pigltin.semantic;

import elmer.p1pigltin.ast.AstNode;
import elmer.p1pigltin.core.CompilerError;
import elmer.p1pigltin.core.ErrorReporter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

/**
 * analz semantic 2etap declarar y  validar tipos/flujo.
 */
public class SemanticAnalyzer {
    private final SymbolTable tabla;
    private final ErrorReporter errores;
    private int cicloDepth;
    private Type retornoActual;
    private boolean funcionActio;
    private boolean alcanzable = true;

    public SemanticAnalyzer(SymbolTable tabla, ErrorReporter errores) {
        this.tabla = tabla;
        this.errores = errores;
    }

    /**
     * primera pasada reg nmbrs y firmas antes de validar usos.
     */
    public void declararSimbolos(AstNode program) {
        if (program == null) return;
        switch (program.tipo) {
            case PROGRAM -> program.children.forEach(this::declararSimbolos);
            case SECTION -> program.children.forEach(this::declararSimbolos);
            case VAR_DECL -> declararVariable(program);
            case ARRAY_DECL -> declararArray(program);
            case STRUCT_DEF -> declararStruct(program);
            case STRUCT_VAR_DECL -> declararStructVariable(program);
            case FUNC_DEF -> declararFuncion(program);
            case FOR -> declararSimbolos(program.children.get(0));
            default -> { }
        }
    }

    private void declararFuncion(AstNode node) {
        Type returnType = Type.fromName((String) node.attrs.get("tipoRetorno"));
        int parameterCount = (Integer) node.attrs.get("paramCount");
        List<Type> parameterTypes = new ArrayList<>();
        for (int i = 0; i < parameterCount; i++) {
            parameterTypes.add(Type.fromName((String) node.children.get(i).attrs.get("tipoDeclarado")));
        }
        declarar(node, tabla.declararFuncion((String) node.attrs.get("nombre"), returnType,
                Boolean.TRUE.equals(node.attrs.get("esActio")), parameterTypes), "Funcion ya declarada");
    }

    /**
     * 2d pasada vald tipos, accesos, retornos y ctrl de flujo.
     */
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
            case PROGRAM, SECTION -> { node.children.forEach(this::verificar); yield Type.VOID; }
            case BLOCK -> {
                for (AstNode child : node.children) {
                    if (!alcanzable) {
                        error(child, "Codigo no alcanzable despues de una terminacion");
                    }
                    verificar(child);
                }
                yield Type.VOID;
            }
            case VAR_DECL -> verificarDeclaracion(node);
            case ARRAY_DECL -> verificarArray(node);
            case STRUCT_DEF -> Type.VOID;
            case STRUCT_VAR_DECL -> verificarStructLiteral(node, (String) node.attrs.get("tipoDeclarado"));
            case FUNC_DEF -> verificarFuncion(node);
            case STRUCT_FIELD_INIT -> verificarFieldOrArrayInit(node);
            case ASSIGN -> verificarAsignacion(node);
            case BINARY_EXPR -> verificarBinaria(node);
            case UNARY_EXPR -> verificarUnaria(node);
            case PAREN_EXPR -> verificar(node.children.get(0));
            case LITERAL -> Type.fromName((String) node.attrs.get("tipoLiteral"));
            case VAR_ACCESS -> verificarAcceso(node);
            case PRINT -> { node.children.forEach(this::verificar); yield Type.VOID; }
            case READ -> verificarLectura(node);
            case IF -> verificarIf(node);
            case WHILE, DO_WHILE, FOR -> verificarLoop(node);
            case RETURN -> verificarRetorno(node);
            case BREAK -> { verificarInterrupcion(node, "interrumpe"); yield Type.VOID; }
            case CONTINUE -> { verificarInterrupcion(node, "perge"); yield Type.VOID; }
            case INC_DEC -> {
                Type operand = verificar(node.children.get(0));
                if (operand != Type.NUMERUS && operand != Type.DECIMALIS) {
                    error(node, "El operador " + node.attrs.get("operador")
                            + " requiere NUMERUS o DECIMALIS");
                }
                yield Type.VOID;
            }
            case FUNC_CALL -> verificarLlamada(node);
            default -> { node.children.forEach(this::verificar); yield Type.VOID; }
        };
    }

    /**
     * mnja scope de parametros/locales exig retorno total en ratio.
     */
    private Type verificarFuncion(AstNode node) {
        Type previousReturn = retornoActual;
        boolean previousActio = funcionActio;
        boolean previousReachable = alcanzable;
        retornoActual = Type.fromName((String) node.attrs.get("tipoRetorno"));
        funcionActio = Boolean.TRUE.equals(node.attrs.get("esActio"));
        alcanzable = true;
        tabla.enterScope((String) node.attrs.get("nombre"));
        int paramCount = (Integer) node.attrs.get("paramCount");
        for (int i = 0; i < paramCount; i++) {
            AstNode param = node.children.get(i);
            Type type = Type.fromName((String) param.attrs.get("tipoDeclarado"));
            if (type != null) tabla.declarar((String) param.attrs.get("nombre"), type);
        }
        int bodyStart = paramCount;
        if (bodyStart < node.children.size() && node.children.get(bodyStart).tipo == AstNode.Tipo.SECTION) {
            declararSimbolos(node.children.get(bodyStart));
            bodyStart++;
        }
        for (int i = bodyStart; i < node.children.size(); i++) {
            if (!alcanzable) {
                error(node.children.get(i), "Codigo no alcanzable despues de una terminacion");
            }
            verificar(node.children.get(i));
        }
        if (!funcionActio && retornoActual != Type.VOID && alcanzable) {
            error(node, "La funcion ratio no retorna en todos los caminos");
        }
        tabla.exitScope();
        retornoActual = previousReturn;
        funcionActio = previousActio;
        alcanzable = previousReachable;
        return Type.VOID;
    }

    /**
     * combin alcanzblidd de ramas para detectar codigo muerto real.
     */
    private Type verificarIf(AstNode node) {
        Type condition = verificar(node.children.get(0));
        if (condition != Type.BOOL) error(node, "Corrupcion de Flujo: la condicion debe ser BOOL");
        boolean before = alcanzable;
        boolean allTerminate = node.children.size() > 2;
        for (int i = 1; i < node.children.size(); i++) {
            alcanzable = before;
            verificar(node.children.get(i));
            allTerminate &= !alcanzable;
        }
        alcanzable = before && !allTerminate;
        return Type.VOID;
    }

    private Type verificarLoop(AstNode node) {
        boolean reachableBeforeLoop = alcanzable;
        boolean forLoop = node.tipo == AstNode.Tipo.FOR;
        if (forLoop) {
            tabla.enterScope("for");
            AstNode initializer = node.children.get(0);
            Type initializerType = Type.fromName((String) initializer.attrs.get("tipoDeclarado"));
            if (initializerType != null) {
                tabla.declarar((String) initializer.attrs.get("nombre"), initializerType);
            }
        }
        if (forLoop) {
            verificar(node.children.get(0));
        }
        Type condition = verificar(node.tipo == AstNode.Tipo.DO_WHILE ? node.children.get(1)
            : node.tipo == AstNode.Tipo.FOR ? node.children.get(1) : node.children.get(0));
        if (condition != Type.BOOL) error(node, "Corrupcion de Flujo: la condicion debe ser BOOL");
        cicloDepth++;
        if (node.tipo == AstNode.Tipo.FOR) {
            verificar(node.children.get(2));
            verificar(node.children.get(3));
        } else {
            verificar(node.children.get(0));
        }
        if (forLoop) {
            tabla.exitScope();
        }
        alcanzable = reachableBeforeLoop;
        cicloDepth--;
        return Type.VOID;
    }

    private Type verificarRetorno(AstNode node) {
        if (retornoActual == null) {
            error(node, "reddere solo puede usarse dentro de una funcion");
        } else {
            Type actual = verificar(node.children.get(0));
            if (funcionActio || retornoActual == Type.VOID || !retornoActual.accepts(actual)) {
                error(node, "Tipo de retorno incompatible: se esperaba " + retornoActual + " y se obtuvo " + actual);
            }
        }
        alcanzable = false;
        return Type.VOID;
    }

    private void verificarInterrupcion(AstNode node, String keyword) {
        if (cicloDepth == 0) error(node, keyword + " solo puede usarse dentro de un ciclo");
        alcanzable = false;
    }

    private Type verificarLlamada(AstNode node) {
        SymbolTable.Symbol function = tabla.resolver((String) node.attrs.get("nombre"));
        if (function == null || function.kind() != SymbolTable.Kind.FUNCTION) {
            error(node, "Funcion no declarada: " + node.attrs.get("nombre"));
            return null;
        }
        if (node.children.size() != function.parameterTypes().size()) {
            error(node, "Cantidad incorrecta de argumentos para funcion: " + node.attrs.get("nombre"));
        }
        int count = Math.min(node.children.size(), function.parameterTypes().size());
        for (int i = 0; i < node.children.size(); i++) {
            Type actual = verificar(node.children.get(i));
            if (i < count && !function.parameterTypes().get(i).accepts(actual)) {
                error(node.children.get(i), "Argumento incompatible en posicion " + i);
            }
        }
        return function.type();
    }

    private Type verificarUnaria(AstNode node) {
        String operator = (String) node.attrs.get("operador");
        Type operand = verificar(node.children.get(0));
        if (operator.equals("non") && operand != Type.BOOL) {
            error(node, "Corrupcion de Flujo: non requiere BOOL");
            return null;
        }
        if (operator.equals("-") && operand != Type.NUMERUS && operand != Type.DECIMALIS
                && operand != Type.LITTERA) {
            error(node, "Operador - requiere NUMERUS, DECIMALIS o LITTERA");
            return null;
        }
        return operand;
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
            AstNode initializer = node.children.get(1);
            Integer size = constantInteger(node.children.get(0));
            if (size != null && initializer.children.size() > size) {
                error(node, "El arreglo '" + node.attrs.get("nombre")
                        + "' recibe " + initializer.children.size()
                        + " elementos, pero su tamaño es " + size);
            }
            for (AstNode value : initializer.children) {
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
        if ((operator.equals("&&") || operator.equals("||"))
                && (left != Type.BOOL || right != Type.BOOL)) {
            error(node, "Corrupcion de Flujo: los operandos deben ser BOOL");
        }
        return result;
    }

    /**
     * resuelve cadenas tipo a.b[i].c y valida indice/rango cuando aplica.
     */
    private Type verificarAcceso(AstNode node) {
        String name = (String) node.attrs.get("nombreBase");
        SymbolTable.Symbol symbol = tabla.resolver(name);
        if (symbol == null) {
            error(node, "Variable no declarada: " + name);
            return null;
        }
        String currentType = symbol.declaredType();
        Type currentPrimitive = symbol.type();
        boolean currentIsArray = symbol.kind() == SymbolTable.Kind.ARRAY;
        for (AstNode step : node.children) {
            if (step.tipo == AstNode.Tipo.ACCESS_STEP_INDEX) {
                Type indexType = verificar(step.children.get(0));
                if (indexType != Type.NUMERUS) {
                    error(step, "El indice de un arreglo debe ser NUMERUS");
                }
                Integer index = constantInteger(step.children.get(0));
                if (index != null && currentIsArray && symbol.kind() == SymbolTable.Kind.ARRAY
                        && (index < 0 || index >= symbol.size())) {
                    error(step, "Indice fuera de rango en '" + name + "': " + index);
                }
                currentIsArray = false;
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
                currentIsArray = field.array();
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
        boolean currentIsArray = symbol.kind() == SymbolTable.Kind.ARRAY;
        for (AstNode step : access.children) {
            if (step.tipo == AstNode.Tipo.ACCESS_STEP_PROP) {
                SymbolTable.Symbol structure = tabla.resolver(currentType);
                if (structure == null) return null;
                SymbolTable.Field field = structure.fields().get(step.attrs.get("nombreCampo"));
                if (field == null) return null;
                currentType = field.typeName();
                currentIsArray = field.array();
            } else if (currentIsArray) {
                currentIsArray = false;
            }
        }
        return currentType;
    }

    /**
     * cpara literal de struct contra definicion: campos, tipos y faltantes.
     */
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
            Type expected = Type.fromName(definition.typeName());
            AstNode value = field.children.get(0);
            if (definition.array() && value.tipo == AstNode.Tipo.VAR_ACCESS
                    && value.attrs.get("nombreBase").equals(definition.typeName())) {
                continue;
            }
            if (expected != null) {
                Type actual = verificar(value);
                if (!expected.accepts(actual)) error(field, "Tipo incorrecto para atributo '" + name + "'");
            } else {
                SymbolTable.Symbol nested = tabla.resolver(definition.typeName());
                if (nested == null || nested.kind() != SymbolTable.Kind.STRUCTURE
                        || value.tipo != AstNode.Tipo.STRUCT_FIELD_INIT) {
                    error(field, "Tipo incorrecto para atributo '" + name + "'");
                } else {
                    verificarStructFields(value, nested);
                }
            }
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
        Optional<Object> value = ConstantFolder.evaluar(node);
        if (value.isPresent() && value.get() instanceof Number number
                && number.doubleValue() == number.intValue()) return number.intValue();
        return null;
    }

    private Type verificarLectura(AstNode node) {
        String name = (String) node.attrs.get("nombre");
        if (name != null && tabla.resolver(name) == null) error(node, "Variable no declarada: " + name);
        return Type.VOID;
    }

    private void declarar(AstNode node, boolean success, String message) {
        if (!success) error(node, message + ": " + node.attrs.get("nombre"));
    }

    private void error(AstNode node, String message) {
        errores.report(new CompilerError(CompilerError.Fase.SEMANTICA, message, node.line, node.column));
    }
}
