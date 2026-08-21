package elmer.p1pigltin.translator;

import elmer.p1pigltin.ast.AstNode;

import java.util.stream.Collectors;

public class PigLatinTranslator {
    public String traducir(AstNode node) {
        return switch (node.tipo) {
            case PROGRAM -> node.children.stream().map(this::traducir).collect(Collectors.joining("\n"));
            case VAR_DECL -> traducirDeclaracion(node);
                case ARRAY_DECL -> traducirArray(node);
                case STRUCT_DEF -> traducirStruct(node);
                case STRUCT_MEMBER -> PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre"))
                    + " : " + PigLatinWordRules.toPigLatin((String) node.attrs.get("tipoDeclarado"));
                case STRUCT_VAR_DECL -> PigLatinWordRules.toPigLatin("esto") + " "
                    + PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre")) + " : "
                    + PigLatinWordRules.toPigLatin((String) node.attrs.get("tipoDeclarado")) + " "
                    + traducir(node.children.get(0));
                case STRUCT_FIELD_INIT -> traducirStructContent(node);
                case ASSIGN -> traducir(node.children.get(0)) + " = " + traducir(node.children.get(1)) + ";";
            case BINARY_EXPR -> traducir(node.children.get(0)) + " "
                    + node.attrs.get("operador") + " " + traducir(node.children.get(1));
            case UNARY_EXPR -> node.attrs.get("operador") + traducir(node.children.get(0));
            case LITERAL -> traducirLiteral(node);
            case VAR_ACCESS -> traducirAcceso(node);
            case PRINT -> "%OINK " + node.children.stream()
                    .map(this::traducir).collect(Collectors.joining(" %OINK ")) + ";";
            default -> throw new IllegalStateException("Nodo no soportado: " + node.tipo);
        };
    }

    private String traducirArray(AstNode node) {
        String result = "series " + PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre"))
                + "[" + traducir(node.children.get(0)) + "] : "
                + PigLatinWordRules.toPigLatin((String) node.attrs.get("tipoElemento"));
        return node.children.size() > 1 ? result + " " + traducir(node.children.get(1)) + ";" : result + ";";
    }

    private String traducirStruct(AstNode node) {
        return "structura " + PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre")) + " { "
                + node.children.stream().map(this::traducir).collect(Collectors.joining("; "))
                + " } finis;";
    }

    private String traducirStructContent(AstNode node) {
        if (node.attrs.containsKey("nombreCampo")) {
            return PigLatinWordRules.toPigLatin((String) node.attrs.get("nombreCampo")) + ": "
                    + traducir(node.children.get(0));
        }
        return "{ " + node.children.stream().map(this::traducir).collect(Collectors.joining(", ")) + " }";
    }

    private String traducirAcceso(AstNode node) {
        StringBuilder result = new StringBuilder(
                PigLatinWordRules.toPigLatin((String) node.attrs.get("nombreBase")));
        for (AstNode step : node.children) {
            if (step.tipo == AstNode.Tipo.ACCESS_STEP_PROP) {
                result.append('.').append(PigLatinWordRules.toPigLatin((String) step.attrs.get("nombreCampo")));
            } else {
                result.append('[').append(traducir(step.children.get(0))).append(']');
            }
        }
        return result.toString();
    }

    private String traducirDeclaracion(AstNode node) {
        StringBuilder result = new StringBuilder()
                .append(PigLatinWordRules.toPigLatin("esto")).append(' ')
                .append(PigLatinWordRules.toPigLatin((String) node.attrs.get("nombre"))).append(" : ")
                .append(PigLatinWordRules.toPigLatin((String) node.attrs.get("tipoDeclarado")));
        if (!node.children.isEmpty()) {
            result.append(' ').append(traducir(node.children.get(0)));
        } else if (node.attrs.containsKey("valor")) {
            result.append(' ').append(PigLatinWordRules.toPigLatin((String) node.attrs.get("valor")));
        }
        return result.append(';').toString();
    }

    private String traducirLiteral(AstNode node) {
        Object value = node.attrs.get("valor");
        return switch ((String) node.attrs.get("tipoLiteral")) {
            case "TEXTUM" -> "\"" + value + "\"";
            case "LITTERA" -> "'" + value.toString() + "'";
            case "BOOL" -> PigLatinWordRules.toPigLatin(value.toString());
            default -> value.toString();
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