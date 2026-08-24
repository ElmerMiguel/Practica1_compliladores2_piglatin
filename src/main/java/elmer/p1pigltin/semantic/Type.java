package elmer.p1pigltin.semantic;

public enum Type {
    NUMERUS(3), DECIMALIS(4), TEXTUM(5), LITTERA(2), BOOL(1), VOID(0);

    private final int precedence;

    Type(int precedence) {
        this.precedence = precedence;
    }

    public static Type fromName(String name) {
        if (name == null) {
            return null;
        }
        return switch (name) {
            case "numerus", "NUMERUS" -> NUMERUS;
            case "decimalis", "DECIMALIS" -> DECIMALIS;
            case "textum", "TEXTUM" -> TEXTUM;
            case "littera", "LITTERA" -> LITTERA;
            case "bool", "BOOL", "verum", "VERUM", "falsus", "FALSUS" -> BOOL;
            case "void" -> VOID;
            default -> null;
        };
    }

    public static Type resultOf(Type left, Type right, String operator) {
        if (left == null || right == null || left == VOID || right == VOID) {
            return null;
        }
        if (operator.equals("&&") || operator.equals("||")) {
            return left == BOOL && right == BOOL ? BOOL : null;
        }
        if (operator.equals("==") || operator.equals("!=")) {
            return left.accepts(right) || right.accepts(left) ? BOOL : null;
        }
        if (operator.equals("<") || operator.equals(">")
                || operator.equals("<=") || operator.equals(">=")) {
            return isNumeric(left) && isNumeric(right) ? BOOL : null;
        }
        if (left == TEXTUM || right == TEXTUM) {
            return operator.equals("+") ? TEXTUM : null;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")
                || operator.equals("/")) {
            return left.precedence >= right.precedence ? left : right;
        }
        return null;
    }

    private static boolean isNumeric(Type type) {
        return type == NUMERUS || type == DECIMALIS || type == LITTERA;
    }

    public boolean accepts(Type actual) {
        return actual != null && this != VOID && actual != VOID && actual.precedence <= precedence;
    }
}