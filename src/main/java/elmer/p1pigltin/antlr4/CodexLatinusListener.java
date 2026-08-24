// Generated from CodexLatinus.g4 by ANTLR 4.9.2

package elmer.p1pigltin.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexLatinusParser}.
 */
public interface CodexLatinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CodexLatinusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CodexLatinusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#globalSection}.
	 * @param ctx the parse tree
	 */
	void enterGlobalSection(CodexLatinusParser.GlobalSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#globalSection}.
	 * @param ctx the parse tree
	 */
	void exitGlobalSection(CodexLatinusParser.GlobalSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclaration(CodexLatinusParser.GlobalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclaration(CodexLatinusParser.GlobalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#funcSection}.
	 * @param ctx the parse tree
	 */
	void enterFuncSection(CodexLatinusParser.FuncSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#funcSection}.
	 * @param ctx the parse tree
	 */
	void exitFuncSection(CodexLatinusParser.FuncSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#mainSection}.
	 * @param ctx the parse tree
	 */
	void enterMainSection(CodexLatinusParser.MainSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#mainSection}.
	 * @param ctx the parse tree
	 */
	void exitMainSection(CodexLatinusParser.MainSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CodexLatinusParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CodexLatinusParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#ratioFunction}.
	 * @param ctx the parse tree
	 */
	void enterRatioFunction(CodexLatinusParser.RatioFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#ratioFunction}.
	 * @param ctx the parse tree
	 */
	void exitRatioFunction(CodexLatinusParser.RatioFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#actioFunction}.
	 * @param ctx the parse tree
	 */
	void enterActioFunction(CodexLatinusParser.ActioFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#actioFunction}.
	 * @param ctx the parse tree
	 */
	void exitActioFunction(CodexLatinusParser.ActioFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(CodexLatinusParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(CodexLatinusParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CodexLatinusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CodexLatinusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#localVarSection}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarSection(CodexLatinusParser.LocalVarSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#localVarSection}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarSection(CodexLatinusParser.LocalVarSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(CodexLatinusParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(CodexLatinusParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CodexLatinusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CodexLatinusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CodexLatinusParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CodexLatinusParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolShorthandDecl}
	 * labeled alternative in {@link CodexLatinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolShorthandDecl(CodexLatinusParser.BoolShorthandDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolShorthandDecl}
	 * labeled alternative in {@link CodexLatinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolShorthandDecl(CodexLatinusParser.BoolShorthandDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedVarDecl}
	 * labeled alternative in {@link CodexLatinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedVarDecl(CodexLatinusParser.TypedVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedVarDecl}
	 * labeled alternative in {@link CodexLatinusParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedVarDecl(CodexLatinusParser.TypedVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedArrayDecl}
	 * labeled alternative in {@link CodexLatinusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedArrayDecl(CodexLatinusParser.TypedArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedArrayDecl}
	 * labeled alternative in {@link CodexLatinusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedArrayDecl(CodexLatinusParser.TypedArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolArrayDecl}
	 * labeled alternative in {@link CodexLatinusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolArrayDecl(CodexLatinusParser.BoolArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolArrayDecl}
	 * labeled alternative in {@link CodexLatinusParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolArrayDecl(CodexLatinusParser.BoolArrayDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(CodexLatinusParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(CodexLatinusParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(CodexLatinusParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(CodexLatinusParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CodexLatinusParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CodexLatinusParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(CodexLatinusParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(CodexLatinusParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(CodexLatinusParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(CodexLatinusParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#structMemberSep}.
	 * @param ctx the parse tree
	 */
	void enterStructMemberSep(CodexLatinusParser.StructMemberSepContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#structMemberSep}.
	 * @param ctx the parse tree
	 */
	void exitStructMemberSep(CodexLatinusParser.StructMemberSepContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#memberType}.
	 * @param ctx the parse tree
	 */
	void enterMemberType(CodexLatinusParser.MemberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#memberType}.
	 * @param ctx the parse tree
	 */
	void exitMemberType(CodexLatinusParser.MemberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#structVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructVarDeclaration(CodexLatinusParser.StructVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#structVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructVarDeclaration(CodexLatinusParser.StructVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#blockEnd}.
	 * @param ctx the parse tree
	 */
	void enterBlockEnd(CodexLatinusParser.BlockEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#blockEnd}.
	 * @param ctx the parse tree
	 */
	void exitBlockEnd(CodexLatinusParser.BlockEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteral(CodexLatinusParser.StructLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#structLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteral(CodexLatinusParser.StructLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#structFieldInit}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldInit(CodexLatinusParser.StructFieldInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#structFieldInit}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldInit(CodexLatinusParser.StructFieldInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CodexLatinusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CodexLatinusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link CodexLatinusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(CodexLatinusParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link CodexLatinusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(CodexLatinusParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structLiteralAssignment}
	 * labeled alternative in {@link CodexLatinusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterStructLiteralAssignment(CodexLatinusParser.StructLiteralAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structLiteralAssignment}
	 * labeled alternative in {@link CodexLatinusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitStructLiteralAssignment(CodexLatinusParser.StructLiteralAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(CodexLatinusParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(CodexLatinusParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(CodexLatinusParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(CodexLatinusParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(CodexLatinusParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(CodexLatinusParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CodexLatinusParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CodexLatinusParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void enterElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#elseIfClause}.
	 * @param ctx the parse tree
	 */
	void exitElseIfClause(CodexLatinusParser.ElseIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(CodexLatinusParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(CodexLatinusParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CodexLatinusParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CodexLatinusParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(CodexLatinusParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#doWhileStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(CodexLatinusParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(CodexLatinusParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(CodexLatinusParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CodexLatinusParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CodexLatinusParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(CodexLatinusParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(CodexLatinusParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(CodexLatinusParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(CodexLatinusParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#functionCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStmt(CodexLatinusParser.FunctionCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#functionCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStmt(CodexLatinusParser.FunctionCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CodexLatinusParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CodexLatinusParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(CodexLatinusParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(CodexLatinusParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(CodexLatinusParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(CodexLatinusParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(CodexLatinusParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(CodexLatinusParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(CodexLatinusParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(CodexLatinusParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CodexLatinusParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CodexLatinusParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(CodexLatinusParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(CodexLatinusParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(CodexLatinusParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(CodexLatinusParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(CodexLatinusParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(CodexLatinusParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(CodexLatinusParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#relationalExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(CodexLatinusParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(CodexLatinusParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(CodexLatinusParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(CodexLatinusParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(CodexLatinusParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(CodexLatinusParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(CodexLatinusParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(CodexLatinusParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(CodexLatinusParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexLatinusParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CodexLatinusParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexLatinusParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CodexLatinusParser.AtomContext ctx);
}