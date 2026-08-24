package elmer.p1pigltin.ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class AstDotExporter {
    private AstDotExporter() { }

    public static String exportar(AstNode raiz) {
        StringBuilder dot = new StringBuilder("digraph AST {\n")
                .append("    node [shape=box, fontname=\"Courier\"];\n");
        if (raiz != null) {
            exportarNodo(raiz, dot, new int[]{0});
        }
        return dot.append("}\n").toString();
    }

    private static String exportarNodo(AstNode node, StringBuilder dot, int[] counter) {
        String id = "n" + counter[0]++;
        dot.append("    ").append(id).append(" [label=\"")
                .append(escape(label(node))).append("\"];\n");
        for (int index = 0; index < node.children.size(); index++) {
            AstNode child = node.children.get(index);
            String childId = exportarNodo(child, dot, counter);
            String edgeLabel = edgeLabel(node, index);
            dot.append("    ").append(id).append(" -> ").append(childId);
            if (edgeLabel != null) {
                dot.append(" [label=\"").append(escape(edgeLabel)).append("\"]");
            }
            dot.append(";\n");
        }
        return id;
    }

    private static String label(AstNode node) {
        List<String> lines = new ArrayList<>();
        lines.add(node.tipo.name());
        switch (node.tipo) {
            case VAR_DECL, ARRAY_DECL, STRUCT_DEF, STRUCT_VAR_DECL, FUNC_DEF, PARAM, FUNC_CALL, SECTION -> {
                add(lines, node.attrs, "nombre");
                add(lines, node.attrs, "tipoDeclarado");
                add(lines, node.attrs, "tipoRetorno");
                add(lines, node.attrs, "tipoElemento");
            }
            case BINARY_EXPR, UNARY_EXPR, INC_DEC -> add(lines, node.attrs, "operador");
            case LITERAL -> {
                add(lines, node.attrs, "valor");
                add(lines, node.attrs, "tipoLiteral");
            }
            case VAR_ACCESS -> add(lines, node.attrs, "nombreBase");
            case STRUCT_MEMBER, STRUCT_FIELD_INIT, ACCESS_STEP_PROP, READ -> {
                add(lines, node.attrs, "nombreCampo");
                add(lines, node.attrs, "nombre");
            }
            default -> { }
        }
        return String.join("\n", lines);
    }

    private static String edgeLabel(AstNode node, int index) {
        return switch (node.tipo) {
            case VAR_DECL, ARRAY_DECL -> index == 0 ? "init/size" : "init";
            case IF -> index == 0 ? "condicion" : index == 1 ? "then" : "rama";
            case WHILE -> index == 0 ? "condicion" : "body";
            case DO_WHILE -> index == 0 ? "body" : "condicion";
            case FOR -> index == 0 ? "init" : index == 1 ? "condicion" : index == 2 ? "update" : "body";
            case ASSIGN -> index == 0 ? "target" : "value";
            case FUNC_DEF -> index < (Integer) node.attrs.get("paramCount") ? "param" : "body";
            case BLOCK -> "statement";
            case BINARY_EXPR -> index == 0 ? "left" : "right";
            case UNARY_EXPR, INC_DEC, RETURN -> "value";
            case ACCESS_STEP_INDEX, STRUCT_FIELD_INIT -> "value";
            default -> null;
        };
    }

    private static void add(List<String> lines, Map<String, Object> attrs, String key) {
        Object value = attrs.get(key);
        if (value != null && lines.size() < 4) {
            lines.add(key + "=" + value);
        }
    }

    private static String escape(String value) {
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\r", "\\r")
                .replace("\n", "\\n");
    }
}