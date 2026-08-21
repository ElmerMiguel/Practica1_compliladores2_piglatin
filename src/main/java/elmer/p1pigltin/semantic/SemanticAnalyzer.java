package elmer.p1pigltin.semantic;

import elmer.p1pigltin.ast.AstNode;
import elmer.p1pigltin.core.CompilerError;
import elmer.p1pigltin.core.ErrorReporter;

public class SemanticAnalyzer {
    private final SymbolTable tabla;
    private final ErrorReporter errores;

    public SemanticAnalyzer(SymbolTable tabla, ErrorReporter errores) {
        this.tabla = tabla;
        this.errores = errores;
    }

    public void declararSimbolos(AstNode program) {
        if (program == null) {
            return;
        }
        switch (program.tipo) {
            case PROGRAM -> program.children.forEach(this::declararSimbolos);
            case VAR_DECL -> declararVariable(program);
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
        String name = (String) node.attrs.get("nombre");
        if (!tabla.declarar(name, type)) {
            error(node, "Variable ya declarada: " + name);
        }
    }

    private Type verificar(AstNode node) {
        if (node == null) {
            return Type.VOID;
        }
        return switch (node.tipo) {
            case PROGRAM -> {
                node.children.forEach(this::verificar);
                yield Type.VOID;
            }
            case VAR_DECL -> verificarDeclaracion(node);
            case BINARY_EXPR -> verificarBinaria(node);
            case UNARY_EXPR -> verificar(node.children.get(0));
            case LITERAL -> Type.fromName((String) node.attrs.get("tipoLiteral"));
            case VAR_ACCESS -> verificarAcceso(node);
            case PRINT -> {
                node.children.forEach(this::verificar);
                yield Type.VOID;
            }
            default -> {
                node.children.forEach(this::verificar);
                yield Type.VOID;
            }
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

    private Type verificarBinaria(AstNode node) {
        Type left = verificar(node.children.get(0));
        Type right = verificar(node.children.get(1));
        String operator = (String) node.attrs.get("operador");
        Type result = Type.resultOf(left, right, operator);
        if (result == null) {
            error(node, "Operacion incompatible: " + left + " " + operator + " " + right);
        }
        return result;
    }

    private Type verificarAcceso(AstNode node) {
        String name = (String) node.attrs.get("nombreBase");
        SymbolTable.Symbol symbol = tabla.resolver(name);
        if (symbol == null) {
            error(node, "Variable no declarada: " + name);
            return null;
        }
        return symbol.type();
    }

    private void error(AstNode node, String message) {
        errores.report(new CompilerError(CompilerError.Fase.SEMANTICA,
                message, node.line, node.column));
    }
}