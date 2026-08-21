package elmer.p1pigltin.ast;

import elmer.p1pigltin.antlr4.CodexLatinusBaseVisitor;
import elmer.p1pigltin.antlr4.CodexLatinusParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class AstBuilder extends CodexLatinusBaseVisitor<AstNode> {
    @Override
    public AstNode visitProgram(CodexLatinusParser.ProgramContext ctx) {
        AstNode program = node(AstNode.Tipo.PROGRAM, ctx);
        if (ctx.mainSection() != null) {
            program.children.addAll(visit(ctx.mainSection()).children);
        }
        return program;
    }

    @Override
    public AstNode visitMainSection(CodexLatinusParser.MainSectionContext ctx) {
        AstNode section = node(AstNode.Tipo.PROGRAM, ctx);
        for (CodexLatinusParser.VarDeclarationContext declaration : ctx.varDeclaration()) {
            section.child(visit(declaration));
        }
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) {
            section.child(visit(statement));
        }
        return section;
    }

    @Override
    public AstNode visitTypedVarDecl(CodexLatinusParser.TypedVarDeclContext ctx) {
        AstNode declaration = node(AstNode.Tipo.VAR_DECL, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoDeclarado", ctx.type().getText());
        if (ctx.expr() != null) {
            declaration.child(visit(ctx.expr()));
        }
        return declaration;
    }

    @Override
    public AstNode visitBoolShorthandDecl(CodexLatinusParser.BoolShorthandDeclContext ctx) {
        return node(AstNode.Tipo.VAR_DECL, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoDeclarado", "bool")
                .attr("valor", ctx.getChild(3).getText());
    }

    @Override
    public AstNode visitPrintStmt(CodexLatinusParser.PrintStmtContext ctx) {
        AstNode print = node(AstNode.Tipo.PRINT, ctx);
        for (CodexLatinusParser.ExprContext expression : ctx.expr()) {
            print.child(visit(expression));
        }
        return print;
    }

    @Override
    public AstNode visitExpr(CodexLatinusParser.ExprContext ctx) {
        return visit(ctx.logicalOrExpr());
    }

    @Override
    public AstNode visitLogicalOrExpr(CodexLatinusParser.LogicalOrExprContext ctx) {
        return binary(ctx, ctx.logicalOrExpr());
    }

    @Override
    public AstNode visitLogicalAndExpr(CodexLatinusParser.LogicalAndExprContext ctx) {
        return binary(ctx, ctx.logicalAndExpr());
    }

    @Override
    public AstNode visitEqualityExpr(CodexLatinusParser.EqualityExprContext ctx) {
        return binary(ctx, ctx.equalityExpr());
    }

    @Override
    public AstNode visitRelationalExpr(CodexLatinusParser.RelationalExprContext ctx) {
        return binary(ctx, ctx.relationalExpr());
    }

    @Override
    public AstNode visitAdditiveExpr(CodexLatinusParser.AdditiveExprContext ctx) {
        return binary(ctx, ctx.additiveExpr());
    }

    @Override
    public AstNode visitMultiplicativeExpr(CodexLatinusParser.MultiplicativeExprContext ctx) {
        return binary(ctx, ctx.multiplicativeExpr());
    }

    private AstNode binary(ParserRuleContext ctx, ParserRuleContext recursivePart) {
        if (recursivePart == null) {
            return visit((ParserRuleContext) ctx.getChild(0));
        }
        AstNode result = node(AstNode.Tipo.BINARY_EXPR, ctx)
                .attr("operador", ctx.getChild(1).getText());
        result.child(visit((ParserRuleContext) ctx.getChild(0)))
                .child(visit((ParserRuleContext) ctx.getChild(2)));
        return result;
    }

    @Override
    public AstNode visitUnaryExpr(CodexLatinusParser.UnaryExprContext ctx) {
        if (ctx.unaryExpr() == null) {
            return visit(ctx.postfixExpr());
        }
        return node(AstNode.Tipo.UNARY_EXPR, ctx)
                .attr("operador", ctx.getChild(0).getText())
                .child(visit(ctx.unaryExpr()));
    }

    @Override
    public AstNode visitPostfixExpr(CodexLatinusParser.PostfixExprContext ctx) {
        AstNode result = visit(ctx.atom());
        for (int i = 0; i < ctx.IDENT().size(); i++) {
            result.child(node(AstNode.Tipo.ACCESS_STEP_PROP, ctx)
                    .attr("nombreCampo", ctx.IDENT(i).getText()));
        }
        return result;
    }

    @Override
    public AstNode visitAtom(CodexLatinusParser.AtomContext ctx) {
        if (ctx.IDENT() != null) {
            return node(AstNode.Tipo.VAR_ACCESS, ctx).attr("nombreBase", ctx.IDENT().getText());
        }
        if (ctx.expr() != null) {
            return visit(ctx.expr());
        }
        Token token = ctx.getStart();
        String text = token.getText();
        Object value = switch (token.getType()) {
            case CodexLatinusParser.NUMERUS_LIT -> Integer.valueOf(text);
            case CodexLatinusParser.DECIMAL_LIT -> Double.valueOf(text);
            case CodexLatinusParser.TEXTUM_LIT, CodexLatinusParser.LITTERA_LIT -> text.substring(1, text.length() - 1);
            case CodexLatinusParser.VERUM -> Boolean.TRUE;
            case CodexLatinusParser.FALSUS -> Boolean.FALSE;
            default -> text;
        };
        return node(AstNode.Tipo.LITERAL, ctx)
                .attr("valor", value)
                .attr("tipoLiteral", literalType(token.getType()));
    }

    private String literalType(int tokenType) {
        return switch (tokenType) {
            case CodexLatinusParser.NUMERUS_LIT -> "NUMERUS";
            case CodexLatinusParser.DECIMAL_LIT -> "DECIMALIS";
            case CodexLatinusParser.TEXTUM_LIT -> "TEXTUM";
            case CodexLatinusParser.LITTERA_LIT -> "LITTERA";
            case CodexLatinusParser.VERUM, CodexLatinusParser.FALSUS -> "BOOL";
            default -> "UNKNOWN";
        };
    }

    private AstNode node(AstNode.Tipo tipo, ParserRuleContext ctx) {
        return new AstNode(tipo, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }
}