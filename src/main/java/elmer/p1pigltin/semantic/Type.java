package elmer.p1pigltin.semantic;

public enum Type {
    NUMERUS(3), DECIMALIS(4), TEXTUM(5), LITTERA(2), BOOL(1), VOID(0);

    private final int precedence;

    Type(int precedence) {
        this.precedence = precedence;
    }

    public static Type fromName(String name) {
        return switch (name.toLowerCase()) {
            case "numerus" -> NUMERUS;
            case "decimalis" -> DECIMALIS;
            case "textum" -> TEXTUM;
            case "littera" -> LITTERA;
            case "bool", "verum", "falsus" -> BOOL;
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
        if (operator.equals("==") || operator.equals("!=") || operator.equals("<")
                || operator.equals(">") || operator.equals("<=") || operator.equals(">=")) {
            return BOOL;
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

    public boolean accepts(Type actual) {
        return actual != null && this != VOID && actual != VOID && actual.precedence <= precedence;
    }
}