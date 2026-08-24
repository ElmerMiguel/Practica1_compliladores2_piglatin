package elmer.p1pigltin.translator;

import elmer.p1pigltin.ast.AstNode;

import java.util.stream.Collectors;

public class PigLatinTranslator {
    public String traducir(AstNode node) {
        return switch (node.tipo) {
                case PROGRAM -> node.children.stream().map(this::traducir).collect(Collectors.joining("\n"))
                    + "\n" + keyword((String) node.attrs.getOrDefault("terminador", "FINIS")) + ";";
            case SECTION -> traducirSeccion(node);
            case BLOCK -> node.children.stream().map(this::traducir).collect(Collectors.joining("\n"));
            case VAR_DECL -> traducirDeclaracion(node);
                case ARRAY_DECL -> traducirArray(node);
                case STRUCT_DEF -> traducirStruct(node);
                case STRUCT_MEMBER -> keyword(Boolean.TRUE.equals(node.attrs.get("esArreglo")) ? "series" : "esto") + " "
                    + word(node, "nombre") + " : " + word(node, "tipoDeclarado") + ";";
                    case STRUCT_VAR_DECL -> keyword("esto") + " "
                    + word(node, "nombre") + " : "
                    + word(node, "tipoDeclarado") + " "
                        + traducir(node.children.get(0))
                        + (Boolean.TRUE.equals(node.attrs.get("conPuntoYComa")) ? ";" : "");
                case STRUCT_FIELD_INIT -> traducirStructContent(node);
                    case ASSIGN -> traducir(node.children.get(0)) + " = " + traducir(node.children.get(1))
                            + (Boolean.TRUE.equals(node.attrs.get("esActualizacion"))
                            || Boolean.FALSE.equals(node.attrs.get("conPuntoYComa")) ? "" : ";");
                    case FUNC_DEF -> traducirFuncion(node);
                    case PARAM -> keyword("esto") + " " + word(node, "nombre") + " : "
                        + word(node, "tipoDeclarado");
                    case IF -> traducirIf(node);
                    case WHILE -> keyword("dum") + " (" + traducir(node.children.get(0)) + ") {\n"
                                + indentLines(traducir(node.children.get(1)), 1) + "\n}\n" + cierre(node) + ";";
                            case DO_WHILE -> keyword("facere") + " {\n" + indentLines(traducir(node.children.get(0)), 1) + "\n}\n" + keyword("dum") + " ("
                        + traducir(node.children.get(1)) + ");";
                            case FOR -> keyword("per") + " (" + quitarPuntoYComa(traducir(node.children.get(0))) + "; "
                                + traducir(node.children.get(1)) + "; " + quitarPuntoYComa(traducir(node.children.get(2))) + ") {\n"
                                + indentLines(traducir(node.children.get(3)), 1) + "\n}";
                            case INC_DEC -> traducir(node.children.get(0)) + node.attrs.get("operador")
                                + (Boolean.TRUE.equals(node.attrs.get("sentencia")) ? ";" : "");
                            case FUNC_CALL -> traducirLlamada(node) + (Boolean.TRUE.equals(node.attrs.get("sentencia")) ? ";" : "");
                    case RETURN -> keyword("reddere") + " " + traducir(node.children.get(0)) + ";";
                    case BREAK -> keyword("interrumpe") + ";";
                    case CONTINUE -> keyword("perge") + ";";
            case BINARY_EXPR -> traducir(node.children.get(0)) + " "
                    + node.attrs.get("operador") + " " + traducir(node.children.get(1));
                case UNARY_EXPR -> ("non".equals(node.attrs.get("operador"))
                        ? keyword("non") : node.attrs.get("operador"))
                    + ("non".equals(node.attrs.get("operador")) ? " " : "")
                    + traducir(node.children.get(0));
                case PAREN_EXPR -> "(" + traducir(node.children.get(0)) + ")";
            case LITERAL -> traducirLiteral(node);
            case VAR_ACCESS -> traducirAcceso(node);
                case PRINT -> "%OINK " + node.children.stream()
                    .map(this::traducir).collect(Collectors.joining(" %OINK ")) + ";";
                case READ -> "%OINK_OINK" + (node.attrs.get("nombre") == null ? "" :
                    " " + PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre")))
                    + (Boolean.TRUE.equals(node.attrs.get("conPuntoYComa")) ? ";" : "");
            default -> throw new IllegalStateException("Nodo no soportado: " + node.tipo);
        };
    }

    private String traducirArray(AstNode node) {
        String result = keyword("series") + " " + word(node, "nombre")
                + "[" + traducir(node.children.get(0)) + "] :";
        if (!Boolean.TRUE.equals(node.attrs.get("tipoInferido"))) {
            result += " " + word(node, "tipoElemento");
        }
        return node.children.size() > 1 ? result + " " + traducir(node.children.get(1)) + ";" : result + ";";
    }

    private String traducirStruct(AstNode node) {
        return keyword("structura") + " " + word(node, "nombre") + " {\n"
            + indentLines(node.children.stream().map(this::traducir).collect(Collectors.joining("\n")), 1)
            + "\n}\n" + cierre(node) + ";";
    }

    private String traducirStructContent(AstNode node) {
        if (node.attrs.containsKey("nombreCampo")) {
            return word(node, "nombreCampo") + ": "
                    + traducir(node.children.get(0));
        }
        return "{\n" + indentLines(node.children.stream().map(this::traducir).collect(Collectors.joining(",\n")), 1)
            + "\n}";
    }

    private String traducirAcceso(AstNode node) {
        StringBuilder result = new StringBuilder(
                word(node, "nombreBase"));
        for (AstNode step : node.children) {
            if (step.tipo == AstNode.Tipo.ACCESS_STEP_PROP) {
                result.append('.').append(word(step, "nombreCampo"));
            } else {
                result.append('[').append(traducir(step.children.get(0))).append(']');
            }
        }
        return result.toString();
    }

    private String traducirFuncion(AstNode node) {
        int params = (Integer) node.attrs.get("paramCount");
        StringBuilder result = new StringBuilder();
        if (Boolean.TRUE.equals(node.attrs.get("esActio"))) {
                result.append(keyword("actio")).append(' ').append(word(node, "nombre"));
        } else {
                result.append(keyword("ratio")).append(' ').append(word(node, "tipoRetorno"))
                    .append(' ').append(word(node, "nombre"));
        }
        result.append('(').append(node.children.subList(0, params).stream()
            .map(this::traducir).collect(Collectors.joining(", "))).append(") {\n");
        for (int i = params; i < node.children.size(); i++) {
            if (i > params) result.append('\n');
            result.append(indentLines(traducir(node.children.get(i)), 1));
        }
        if (node.children.size() > params) result.append('\n');
        return result.append("}\n").append(cierre(node)).append(';').toString();
    }

    private String traducirIf(AstNode node) {
        String result = keyword("si") + " (" + traducir(node.children.get(0)) + ") {\n"
            + indentLines(traducir(node.children.get(1)), 1) + "\n}";
        for (int i = 2; i < node.children.size(); i++) {
            AstNode branch = node.children.get(i);
            if (branch.tipo == AstNode.Tipo.IF) {
                result += "\n" + keyword("aliter") + " (" + traducir(branch.children.get(0)) + ") {\n"
                        + indentLines(traducir(branch.children.get(1)), 1) + "\n}";
            } else {
                result += "\n" + keyword("aliter") + " {\n" + indentLines(traducir(branch), 1) + "\n}";
            }
        }
        return result + "\n" + cierre(node) + ";";
    }

    private String traducirLlamada(AstNode node) {
        return word(node, "nombre") + "("
                + node.children.stream().map(this::traducir).collect(Collectors.joining(", ")) + ")";
    }

    private String quitarPuntoYComa(String value) {
        return value.endsWith(";") ? value.substring(0, value.length() - 1) : value;
    }

    private String traducirDeclaracion(AstNode node) {
        StringBuilder result = new StringBuilder()
                .append(keyword("esto")).append(' ')
                .append(word(node, "nombre")).append(" : ")
                .append(word(node, "tipoDeclarado"));
        if (!node.children.isEmpty() && !esBooleanoCorto(node)) {
            result.append(' ').append(traducir(node.children.get(0)));
        } else if (node.attrs.containsKey("valor")) {
            result.append(' ').append(traducirLiteral(node));
        }
        return result.append(';').toString();
    }

    private boolean esBooleanoCorto(AstNode node) {
        return ("verum".equals(node.attrs.get("tipoDeclarado"))
                || "falsus".equals(node.attrs.get("tipoDeclarado")))
                && node.children.size() == 1
                && node.children.get(0).tipo == AstNode.Tipo.LITERAL;
    }

    private String traducirLiteral(AstNode node) {
        Object value = node.attrs.get("valor");
        String raw = (String) node.attrs.get("raw");
        if (raw != null && (raw.startsWith("\"") || raw.startsWith("'"))) return raw;
        return switch ((String) node.attrs.get("tipoLiteral")) {
            case "TEXTUM", "LITTERA" -> String.valueOf(value);
            case "BOOL" -> PigLatinWordRules.toPigLatin(value.toString());
            default -> value.toString();
        };
    }

    private String traducirSeccion(AstNode node) {
        if ("corchetes".equals(node.attrs.get("delimitador"))) {
            return PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre")) + "[\n"
                    + indentLines(node.children.stream().map(this::traducir).collect(Collectors.joining("\n")), 1)
                    + "\n]";
        }
        return PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre")) + ">\n"
                + node.children.stream().map(this::traducir).collect(Collectors.joining("\n"));
    }

    private String cierre(AstNode node) {
        return PigLatinWordRules.toPigLatin((String) node.attrs.getOrDefault("cierre", "finis"));
    }

    private String indentLines(String text, int depth) {
        String prefix = "    ".repeat(depth);
        return text.lines().map(line -> prefix + line).collect(Collectors.joining("\n"));
    }

    private String word(AstNode node, String attr) {
        return PigLatinWordRules.toPigLatin((String) node.attrs.get(attr));
    }

    private String keyword(String value) {
        return switch (value) {
            case "print" -> "%OINK";
            case "read" -> "%OINK_OINK";
            default -> PigLatinWordRules.toPigLatin(value);
        };
    }

    public static final class PigLatinWordRules {
        private PigLatinWordRules() { }

        public static String toPigLatin(String word) {
            if (word == null || word.isEmpty()) {
                return word;
            }
            if (startsWithVowel(word)) {
                return word + "way";
            }
            int firstVowel = firstVowel(word);
            return firstVowel == -1 ? word + "ay" : word.substring(firstVowel) + word.substring(0, firstVowel) + "ay";
        }

        private static boolean startsWithVowel(String word) {
            return "aeiouAEIOU".indexOf(word.charAt(0)) >= 0;
        }

        private static int firstVowel(String word) {
            for (int i = 0; i < word.length(); i++) {
                if ("aeiouAEIOU".indexOf(word.charAt(i)) >= 0) {
                    return i;
                }
            }
            return -1;
        }
    }
}