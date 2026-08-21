package elmer.p1pigltin.ast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AstNode {
    public enum Tipo {
        PROGRAM, VAR_DECL, ARRAY_DECL, STRUCT_DEF, STRUCT_VAR_DECL,
        ASSIGN, BLOCK, IF, WHILE, DO_WHILE, FOR, FUNC_DEF, PARAM,
        RETURN, BREAK, CONTINUE, PRINT, READ,
        BINARY_EXPR, UNARY_EXPR, LITERAL, VAR_ACCESS, FUNC_CALL, INC_DEC,
        STRUCT_MEMBER, STRUCT_FIELD_INIT, ACCESS_STEP_PROP, ACCESS_STEP_INDEX
    }

    public final Tipo tipo;
    public final int line;
    public final int column;
    public final Map<String, Object> attrs = new LinkedHashMap<>();
    public final List<AstNode> children = new ArrayList<>();

    public AstNode(Tipo tipo, int line, int column) {
        this.tipo = tipo;
        this.line = line;
        this.column = column;
    }

    public AstNode attr(String name, Object value) {
        attrs.put(name, value);
        return this;
    }

    public AstNode child(AstNode node) {
        if (node != null) {
            children.add(node);
        }
        return this;
    }
}