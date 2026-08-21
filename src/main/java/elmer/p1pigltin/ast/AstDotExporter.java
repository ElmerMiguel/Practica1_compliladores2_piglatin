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
        for (AstNode child : node.children) {
            String childId = exportarNodo(child, dot, counter);
            dot.append("    ").append(id).append(" -> ").append(childId).append(";\n");
        }
        return id;
    }

    private static String label(AstNode node) {
        List<String> lines = new ArrayList<>();
        lines.add(node.tipo.name());
        switch (node.tipo) {
            case VAR_DECL, ARRAY_DECL, STRUCT_DEF, STRUCT_VAR_DECL, FUNC_DEF, PARAM, FUNC_CALL -> {
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