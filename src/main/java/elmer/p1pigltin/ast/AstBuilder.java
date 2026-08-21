package elmer.p1pigltin.ast;

import elmer.p1pigltin.antlr4.CodexLatinusBaseVisitor;
import elmer.p1pigltin.antlr4.CodexLatinusParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class AstBuilder extends CodexLatinusBaseVisitor<AstNode> {
    @Override
    public AstNode visitProgram(CodexLatinusParser.ProgramContext ctx) {
        AstNode program = node(AstNode.Tipo.PROGRAM, ctx);
        if (ctx.globalSection() != null) {
            program.children.addAll(visit(ctx.globalSection()).children);
        }
        if (ctx.funcSection() != null) {
            program.children.addAll(visit(ctx.funcSection()).children);
        }
        if (ctx.mainSection() != null) {
            program.children.addAll(visit(ctx.mainSection()).children);
        }
        return program;
    }

    @Override
    public AstNode visitFuncSection(CodexLatinusParser.FuncSectionContext ctx) {
        AstNode section = node(AstNode.Tipo.PROGRAM, ctx);
        for (CodexLatinusParser.FunctionDefinitionContext function : ctx.functionDefinition()) {
            section.child(visit(function));
        }
        return section;
    }

    @Override
    public AstNode visitFunctionDefinition(CodexLatinusParser.FunctionDefinitionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AstNode visitRatioFunction(CodexLatinusParser.RatioFunctionContext ctx) {
        AstNode function = node(AstNode.Tipo.FUNC_DEF, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoRetorno", ctx.type().getText())
                .attr("esActio", false);
        addFunctionParts(function, ctx.paramList(), ctx.localVarSection(), ctx.statement());
        return function;
    }

    @Override
    public AstNode visitActioFunction(CodexLatinusParser.ActioFunctionContext ctx) {
        AstNode function = node(AstNode.Tipo.FUNC_DEF, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoRetorno", "void")
                .attr("esActio", true);
        addFunctionParts(function, ctx.paramList(), ctx.localVarSection(), ctx.statement());
        return function;
    }

    private void addFunctionParts(AstNode function, CodexLatinusParser.ParamListContext params,
                                   CodexLatinusParser.LocalVarSectionContext locals,
                                   java.util.List<CodexLatinusParser.StatementContext> statements) {
        int parameterCount = 0;
        if (params != null) {
            for (CodexLatinusParser.ParamContext param : params.param()) {
                function.child(visit(param));
                parameterCount++;
            }
        }
        int localCount = 0;
        if (locals != null) {
            for (CodexLatinusParser.LocalDeclarationContext declaration : locals.localDeclaration()) {
                function.child(visit(declaration));
                localCount++;
            }
        }
        for (CodexLatinusParser.StatementContext statement : statements) {
            function.child(visit(statement));
        }
        function.attr("paramCount", parameterCount).attr("localCount", localCount);
    }

    @Override
    public AstNode visitParam(CodexLatinusParser.ParamContext ctx) {
        return node(AstNode.Tipo.PARAM, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoDeclarado", ctx.type().getText());
    }

    @Override
    public AstNode visitIfStmt(CodexLatinusParser.IfStmtContext ctx) {
        AstNode result = node(AstNode.Tipo.IF, ctx).child(visit(ctx.expr()));
        AstNode body = block(ctx);
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) body.child(visit(statement));
        result.child(body);
        for (CodexLatinusParser.ElseIfClauseContext clause : ctx.elseIfClause()) result.child(visit(clause));
        if (ctx.elseClause() != null) result.child(visit(ctx.elseClause()));
        return result;
    }

    @Override
    public AstNode visitElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx) {
        AstNode result = node(AstNode.Tipo.IF, ctx).child(visit(ctx.expr()));
        AstNode body = block(ctx);
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) body.child(visit(statement));
        return result.child(body);
    }

    @Override
    public AstNode visitElseClause(CodexLatinusParser.ElseClauseContext ctx) {
        AstNode body = block(ctx);
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) body.child(visit(statement));
        return body;
    }

    @Override
    public AstNode visitWhileStmt(CodexLatinusParser.WhileStmtContext ctx) {
        AstNode result = node(AstNode.Tipo.WHILE, ctx).child(visit(ctx.expr()));
        AstNode body = block(ctx);
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) body.child(visit(statement));
        return result.child(body);
    }

    @Override
    public AstNode visitDoWhileStmt(CodexLatinusParser.DoWhileStmtContext ctx) {
        AstNode result = node(AstNode.Tipo.DO_WHILE, ctx);
        AstNode body = block(ctx);
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) body.child(visit(statement));
        return result.child(body).child(visit(ctx.expr()));
    }

    @Override
    public AstNode visitForStmt(CodexLatinusParser.ForStmtContext ctx) {
        AstNode result = node(AstNode.Tipo.FOR, ctx)
                .child(visit(ctx.forInit())).child(visit(ctx.expr())).child(visit(ctx.forUpdate()));
        AstNode body = block(ctx);
        for (CodexLatinusParser.StatementContext statement : ctx.statement()) body.child(visit(statement));
        return result.child(body);
    }

    @Override
    public AstNode visitForInit(CodexLatinusParser.ForInitContext ctx) {
        AstNode init = node(AstNode.Tipo.VAR_DECL, ctx)
                .attr("nombre", ctx.IDENT().getText()).attr("tipoDeclarado", ctx.type().getText());
        if (ctx.expr() != null) init.child(visit(ctx.expr()));
        return init;
    }

    @Override
    public AstNode visitForUpdate(CodexLatinusParser.ForUpdateContext ctx) {
        AstNode update = node(AstNode.Tipo.INC_DEC, ctx).attr("operador", ctx.getChild(1).getText());
        return update.child(visit(ctx.lvalue() != null ? ctx.lvalue() : ctx.expr()));
    }

    @Override
    public AstNode visitIncDecStmt(CodexLatinusParser.IncDecStmtContext ctx) {
        return node(AstNode.Tipo.INC_DEC, ctx).attr("operador", ctx.getChild(1).getText()).child(visit(ctx.lvalue()));
    }

    @Override
    public AstNode visitFunctionCallStmt(CodexLatinusParser.FunctionCallStmtContext ctx) {
        return visit(ctx.functionCall());
    }

    @Override
    public AstNode visitFunctionCall(CodexLatinusParser.FunctionCallContext ctx) {
        AstNode call = node(AstNode.Tipo.FUNC_CALL, ctx).attr("nombre", ctx.IDENT().getText());
        if (ctx.argList() != null) for (CodexLatinusParser.ExprContext expression : ctx.argList().expr()) call.child(visit(expression));
        return call;
    }

    @Override
    public AstNode visitReturnStmt(CodexLatinusParser.ReturnStmtContext ctx) {
        return node(AstNode.Tipo.RETURN, ctx).child(visit(ctx.expr()));
    }

    @Override
    public AstNode visitBreakStmt(CodexLatinusParser.BreakStmtContext ctx) {
        return node(AstNode.Tipo.BREAK, ctx);
    }

    @Override
    public AstNode visitContinueStmt(CodexLatinusParser.ContinueStmtContext ctx) {
        return node(AstNode.Tipo.CONTINUE, ctx);
    }

    private AstNode block(ParserRuleContext ctx) {
        return node(AstNode.Tipo.PROGRAM, ctx);
    }

    @Override
    public AstNode visitGlobalSection(CodexLatinusParser.GlobalSectionContext ctx) {
        AstNode section = node(AstNode.Tipo.PROGRAM, ctx);
        for (CodexLatinusParser.GlobalDeclarationContext declaration : ctx.globalDeclaration()) {
            section.child(visit(declaration));
        }
        return section;
    }

    @Override
    public AstNode visitGlobalDeclaration(CodexLatinusParser.GlobalDeclarationContext ctx) {
        return visitChildren(ctx);
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
    public AstNode visitTypedArrayDecl(CodexLatinusParser.TypedArrayDeclContext ctx) {
        AstNode array = node(AstNode.Tipo.ARRAY_DECL, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoElemento", ctx.arrayType().getText());
        array.child(visit(ctx.expr()));
        if (ctx.arrayInit() != null) {
            array.child(visit(ctx.arrayInit()));
        }
        return array;
    }

    @Override
    public AstNode visitBoolArrayDecl(CodexLatinusParser.BoolArrayDeclContext ctx) {
        AstNode array = node(AstNode.Tipo.ARRAY_DECL, ctx)
                .attr("nombre", ctx.IDENT().getText())
                .attr("tipoElemento", "bool");
        array.child(visit(ctx.expr())).child(visit(ctx.arrayInit()));
        return array;
    }

    @Override
    public AstNode visitArrayInit(CodexLatinusParser.ArrayInitContext ctx) {
        AstNode init = node(AstNode.Tipo.STRUCT_FIELD_INIT, ctx);
        if (ctx.exprList() != null) {
            for (CodexLatinusParser.ExprContext expression : ctx.exprList().expr()) {
                init.child(visit(expression));
            }
        }
        return init;
    }

    @Override
    public AstNode visitStructDefinition(CodexLatinusParser.StructDefinitionContext ctx) {
        AstNode structure = node(AstNode.Tipo.STRUCT_DEF, ctx)
                .attr("nombre", ctx.IDENT().getText());
        for (CodexLatinusParser.StructMemberContext member : ctx.structMember()) {
            structure.child(visit(member));
        }
        return structure;
    }

    @Override
    public AstNode visitStructMember(CodexLatinusParser.StructMemberContext ctx) {
        String name = ctx.IDENT().getText();
        return node(AstNode.Tipo.STRUCT_MEMBER, ctx)
                .attr("nombre", name)
                .attr("tipoDeclarado", ctx.memberType().getText())
                .attr("esArreglo", ctx.KW_SERIES() != null);
    }

    @Override
    public AstNode visitStructVarDeclaration(CodexLatinusParser.StructVarDeclarationContext ctx) {
        return node(AstNode.Tipo.STRUCT_VAR_DECL, ctx)
                .attr("nombre", ctx.IDENT(0).getText())
                .attr("tipoDeclarado", ctx.IDENT(1).getText())
                .child(visit(ctx.structLiteral()));
    }

    @Override
    public AstNode visitStructLiteral(CodexLatinusParser.StructLiteralContext ctx) {
        AstNode literal = node(AstNode.Tipo.STRUCT_FIELD_INIT, ctx);
        for (CodexLatinusParser.StructFieldInitContext field : ctx.structFieldInit()) {
            literal.child(visit(field));
        }
        return literal;
    }

    @Override
    public AstNode visitStructFieldInit(CodexLatinusParser.StructFieldInitContext ctx) {
        return node(AstNode.Tipo.STRUCT_FIELD_INIT, ctx)
                .attr("nombreCampo", ctx.IDENT().getText())
                .child(visit(ctx.expr()));
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
    public AstNode visitExprAssignment(CodexLatinusParser.ExprAssignmentContext ctx) {
        return node(AstNode.Tipo.ASSIGN, ctx)
                .child(visit(ctx.lvalue()))
                .child(visit(ctx.expr()));
    }

    @Override
    public AstNode visitStructLiteralAssignment(CodexLatinusParser.StructLiteralAssignmentContext ctx) {
        return node(AstNode.Tipo.ASSIGN, ctx)
                .child(visit(ctx.lvalue()))
                .child(visit(ctx.structLiteral()));
    }

    @Override
    public AstNode visitLvalue(CodexLatinusParser.LvalueContext ctx) {
        AstNode access = node(AstNode.Tipo.VAR_ACCESS, ctx)
                .attr("nombreBase", ctx.IDENT(0).getText());
        int identifierIndex = 1;
        int expressionIndex = 0;
        for (int childIndex = 1; childIndex < ctx.getChildCount(); childIndex++) {
            String text = ctx.getChild(childIndex).getText();
            if (text.equals(".")) {
                access.child(node(AstNode.Tipo.ACCESS_STEP_PROP, ctx)
                        .attr("nombreCampo", ctx.IDENT(identifierIndex++).getText()));
                childIndex++;
            } else if (text.equals("[")) {
                access.child(node(AstNode.Tipo.ACCESS_STEP_INDEX, ctx)
                        .child(visit(ctx.expr(expressionIndex++))));
                childIndex += 2;
            }
        }
        return access;
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
        int identifierIndex = 0;
        int expressionIndex = 0;
        for (int childIndex = 1; childIndex < ctx.getChildCount(); childIndex++) {
            String text = ctx.getChild(childIndex).getText();
            if (text.equals(".")) {
                result.child(node(AstNode.Tipo.ACCESS_STEP_PROP, ctx)
                        .attr("nombreCampo", ctx.IDENT(identifierIndex++).getText()));
                childIndex++;
            } else if (text.equals("[")) {
                result.child(node(AstNode.Tipo.ACCESS_STEP_INDEX, ctx)
                        .child(visit(ctx.expr(expressionIndex++))));
                childIndex += 2;
            }
        }
        return result;
    }

    @Override
    public AstNode visitAtom(CodexLatinusParser.AtomContext ctx) {
        if (ctx.functionCall() != null) {
            return visit(ctx.functionCall());
        }
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