// Generated from CodexLatinus.g4 by ANTLR 4.9.2

package elmer.p1pigltin.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodexLatinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodexLatinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CodexLatinusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#globalSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalSection(CodexLatinusParser.GlobalSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#globalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDeclaration(CodexLatinusParser.GlobalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#funcSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncSection(CodexLatinusParser.FuncSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#mainSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSection(CodexLatinusParser.MainSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CodexLatinusParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#ratioFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRatioFunction(CodexLatinusParser.RatioFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#actioFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActioFunction(CodexLatinusParser.ActioFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(CodexLatinusParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CodexLatinusParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#localVarSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarSection(CodexLatinusParser.LocalVarSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(CodexLatinusParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CodexLatinusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CodexLatinusParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolShorthandDecl}
	 * labeled alternative in {@link CodexLatinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolShorthandDecl(CodexLatinusParser.BoolShorthandDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedVarDecl}
	 * labeled alternative in {@link CodexLatinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedVarDecl(CodexLatinusParser.TypedVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedArrayDecl}
	 * labeled alternative in {@link CodexLatinusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedArrayDecl(CodexLatinusParser.TypedArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolArrayDecl}
	 * labeled alternative in {@link CodexLatinusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArrayDecl(CodexLatinusParser.BoolArrayDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(CodexLatinusParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#arrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInit(CodexLatinusParser.ArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CodexLatinusParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(CodexLatinusParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#structMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMember(CodexLatinusParser.StructMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#structMemberSep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMemberSep(CodexLatinusParser.StructMemberSepContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#memberType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberType(CodexLatinusParser.MemberTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#structVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructVarDeclaration(CodexLatinusParser.StructVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#blockEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockEnd(CodexLatinusParser.BlockEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#structLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteral(CodexLatinusParser.StructLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#structFieldInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldInit(CodexLatinusParser.StructFieldInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CodexLatinusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link CodexLatinusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(CodexLatinusParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structLiteralAssignment}
	 * labeled alternative in {@link CodexLatinusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructLiteralAssignment(CodexLatinusParser.StructLiteralAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(CodexLatinusParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(CodexLatinusParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(CodexLatinusParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CodexLatinusParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#elseIfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#elseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseClause(CodexLatinusParser.ElseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CodexLatinusParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#doWhileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(CodexLatinusParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(CodexLatinusParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CodexLatinusParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(CodexLatinusParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(CodexLatinusParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#functionCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(CodexLatinusParser.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CodexLatinusParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(CodexLatinusParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(CodexLatinusParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(CodexLatinusParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(CodexLatinusParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CodexLatinusParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(CodexLatinusParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(CodexLatinusParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(CodexLatinusParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(CodexLatinusParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(CodexLatinusParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(CodexLatinusParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(CodexLatinusParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(CodexLatinusParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodexLatinusParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CodexLatinusParser.AtomContext ctx);
}