package elmer.p1pigltin.semantic;

import elmer.p1pigltin.ast.AstNode;

import java.util.Optional;

public final class ConstantFolder {
    private ConstantFolder() { }

    public static Optional<Object> evaluar(AstNode expr) {
        if (expr == null) return Optional.empty();
        if (expr.tipo == AstNode.Tipo.LITERAL) {
            Object value = expr.attrs.get("valor");
            return value instanceof Number ? Optional.of(value) : Optional.empty();
        }
        if (expr.tipo != AstNode.Tipo.BINARY_EXPR || expr.children.size() != 2) {
            return Optional.empty();
        }
        Optional<Object> left = evaluar(expr.children.get(0));
        Optional<Object> right = evaluar(expr.children.get(1));
        if (left.isEmpty() || right.isEmpty()) return Optional.empty();
        double a = ((Number) left.get()).doubleValue();
        double b = ((Number) right.get()).doubleValue();
        return switch ((String) expr.attrs.get("operador")) {
            case "+" -> Optional.of(number(a + b, left.get(), right.get()));
            case "-" -> Optional.of(number(a - b, left.get(), right.get()));
            case "*" -> Optional.of(number(a * b, left.get(), right.get()));
            case "/" -> b == 0 ? Optional.empty() : Optional.of(a / b);
            default -> Optional.empty();
        };
    }

    private static Number number(double value, Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) return (int) value;
        return value;
    }
}