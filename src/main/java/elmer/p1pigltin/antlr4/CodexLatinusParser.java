// Generated from CodexLatinus.g4 by ANTLR 4.9.2

package elmer.p1pigltin.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodexLatinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEC_VARIABILES=1, SEC_MUNERA=2, SEC_MAIOR=3, FIN_PROGRAMA=4, FIN_BLOQUE=5, 
		KW_ESTO=6, KW_SERIES=7, KW_STRUCTURA=8, KW_RATIO=9, KW_ACTIO=10, KW_REDDERE=11, 
		KW_SI=12, KW_ALITER=13, KW_DUM=14, KW_FACERE=15, KW_PER=16, KW_PERGE=17, 
		KW_INTERRUMPE=18, NOT=19, KW_NUMERUS=20, KW_TEXTUM=21, KW_DECIMALIS=22, 
		KW_LITTERA=23, KW_BOOL=24, VERUM=25, FALSUS=26, EQ=27, NEQ=28, LE=29, 
		GE=30, AND=31, OR=32, INC=33, DEC=34, READ=35, PRINT=36, PLUS=37, MINUS=38, 
		STAR=39, SLASH=40, LT=41, GT=42, ASSIGN=43, LPAREN=44, RPAREN=45, LBRACE=46, 
		RBRACE=47, LBRACK=48, RBRACK=49, COLON=50, SEMI=51, COMMA=52, DOT=53, 
		DECIMAL_LIT=54, NUMERUS_LIT=55, TEXTUM_LIT=56, LITTERA_LIT=57, IDENT=58, 
		LINE_COMMENT=59, BLOCK_COMMENT=60, WS=61;
	public static final int
		RULE_program = 0, RULE_globalSection = 1, RULE_globalDeclaration = 2, 
		RULE_funcSection = 3, RULE_mainSection = 4, RULE_functionDefinition = 5, 
		RULE_ratioFunction = 6, RULE_actioFunction = 7, RULE_paramList = 8, RULE_param = 9, 
		RULE_localVarSection = 10, RULE_localDeclaration = 11, RULE_type = 12, 
		RULE_primitiveType = 13, RULE_varDeclaration = 14, RULE_arrayDeclaration = 15, 
		RULE_arrayType = 16, RULE_arrayInit = 17, RULE_exprList = 18, RULE_structDefinition = 19, 
		RULE_structMember = 20, RULE_structMemberSep = 21, RULE_memberType = 22, 
		RULE_structVarDeclaration = 23, RULE_blockEnd = 24, RULE_structLiteral = 25, 
		RULE_structFieldInit = 26, RULE_statement = 27, RULE_assignment = 28, 
		RULE_lvalue = 29, RULE_printStmt = 30, RULE_readStmt = 31, RULE_ifStmt = 32, 
		RULE_elseIfClause = 33, RULE_elseClause = 34, RULE_whileStmt = 35, RULE_doWhileStmt = 36, 
		RULE_forStmt = 37, RULE_forInit = 38, RULE_forUpdate = 39, RULE_incDecStmt = 40, 
		RULE_functionCallStmt = 41, RULE_functionCall = 42, RULE_argList = 43, 
		RULE_returnStmt = 44, RULE_breakStmt = 45, RULE_continueStmt = 46, RULE_expr = 47, 
		RULE_logicalOrExpr = 48, RULE_logicalAndExpr = 49, RULE_equalityExpr = 50, 
		RULE_relationalExpr = 51, RULE_additiveExpr = 52, RULE_multiplicativeExpr = 53, 
		RULE_unaryExpr = 54, RULE_postfixExpr = 55, RULE_atom = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalSection", "globalDeclaration", "funcSection", "mainSection", 
			"functionDefinition", "ratioFunction", "actioFunction", "paramList", 
			"param", "localVarSection", "localDeclaration", "type", "primitiveType", 
			"varDeclaration", "arrayDeclaration", "arrayType", "arrayInit", "exprList", 
			"structDefinition", "structMember", "structMemberSep", "memberType", 
			"structVarDeclaration", "blockEnd", "structLiteral", "structFieldInit", 
			"statement", "assignment", "lvalue", "printStmt", "readStmt", "ifStmt", 
			"elseIfClause", "elseClause", "whileStmt", "doWhileStmt", "forStmt", 
			"forInit", "forUpdate", "incDecStmt", "functionCallStmt", "functionCall", 
			"argList", "returnStmt", "breakStmt", "continueStmt", "expr", "logicalOrExpr", 
			"logicalAndExpr", "equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", 
			"unaryExpr", "postfixExpr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VARIABILES'", "'MUNERA'", "'MAIOR'", "'FINIS'", "'finis'", "'esto'", 
			"'series'", "'structura'", "'ratio'", "'actio'", "'reddere'", "'si'", 
			"'aliter'", "'dum'", "'facere'", "'per'", "'perge'", "'interrumpe'", 
			"'non'", "'numerus'", "'textum'", "'decimalis'", "'littera'", "'bool'", 
			"'verum'", "'falsus'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", 
			"'++'", "'--'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEC_VARIABILES", "SEC_MUNERA", "SEC_MAIOR", "FIN_PROGRAMA", "FIN_BLOQUE", 
			"KW_ESTO", "KW_SERIES", "KW_STRUCTURA", "KW_RATIO", "KW_ACTIO", "KW_REDDERE", 
			"KW_SI", "KW_ALITER", "KW_DUM", "KW_FACERE", "KW_PER", "KW_PERGE", "KW_INTERRUMPE", 
			"NOT", "KW_NUMERUS", "KW_TEXTUM", "KW_DECIMALIS", "KW_LITTERA", "KW_BOOL", 
			"VERUM", "FALSUS", "EQ", "NEQ", "LE", "GE", "AND", "OR", "INC", "DEC", 
			"READ", "PRINT", "PLUS", "MINUS", "STAR", "SLASH", "LT", "GT", "ASSIGN", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COLON", 
			"SEMI", "COMMA", "DOT", "DECIMAL_LIT", "NUMERUS_LIT", "TEXTUM_LIT", "LITTERA_LIT", 
			"IDENT", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CodexLatinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexLatinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainSectionContext mainSection() {
			return getRuleContext(MainSectionContext.class,0);
		}
		public TerminalNode FIN_PROGRAMA() { return getToken(CodexLatinusParser.FIN_PROGRAMA, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(CodexLatinusParser.EOF, 0); }
		public GlobalSectionContext globalSection() {
			return getRuleContext(GlobalSectionContext.class,0);
		}
		public FuncSectionContext funcSection() {
			return getRuleContext(FuncSectionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_VARIABILES) {
				{
				setState(114);
				globalSection();
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_MUNERA) {
				{
				setState(117);
				funcSection();
				}
			}

			setState(120);
			mainSection();
			setState(121);
			match(FIN_PROGRAMA);
			setState(122);
			match(SEMI);
			setState(123);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalSectionContext extends ParserRuleContext {
		public TerminalNode SEC_VARIABILES() { return getToken(CodexLatinusParser.SEC_VARIABILES, 0); }
		public TerminalNode GT() { return getToken(CodexLatinusParser.GT, 0); }
		public List<GlobalDeclarationContext> globalDeclaration() {
			return getRuleContexts(GlobalDeclarationContext.class);
		}
		public GlobalDeclarationContext globalDeclaration(int i) {
			return getRuleContext(GlobalDeclarationContext.class,i);
		}
		public GlobalSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterGlobalSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitGlobalSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitGlobalSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalSectionContext globalSection() throws RecognitionException {
		GlobalSectionContext _localctx = new GlobalSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(SEC_VARIABILES);
			setState(126);
			match(GT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ESTO) | (1L << KW_SERIES) | (1L << KW_STRUCTURA))) != 0)) {
				{
				{
				setState(127);
				globalDeclaration();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public StructVarDeclarationContext structVarDeclaration() {
			return getRuleContext(StructVarDeclarationContext.class,0);
		}
		public GlobalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclarationContext globalDeclaration() throws RecognitionException {
		GlobalDeclarationContext _localctx = new GlobalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalDeclaration);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				structVarDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncSectionContext extends ParserRuleContext {
		public TerminalNode SEC_MUNERA() { return getToken(CodexLatinusParser.SEC_MUNERA, 0); }
		public TerminalNode GT() { return getToken(CodexLatinusParser.GT, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FuncSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFuncSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFuncSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFuncSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncSectionContext funcSection() throws RecognitionException {
		FuncSectionContext _localctx = new FuncSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(SEC_MUNERA);
			setState(140);
			match(GT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_RATIO || _la==KW_ACTIO) {
				{
				{
				setState(141);
				functionDefinition();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainSectionContext extends ParserRuleContext {
		public TerminalNode SEC_MAIOR() { return getToken(CodexLatinusParser.SEC_MAIOR, 0); }
		public TerminalNode GT() { return getToken(CodexLatinusParser.GT, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMainSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMainSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMainSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSectionContext mainSection() throws RecognitionException {
		MainSectionContext _localctx = new MainSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SEC_MAIOR);
			setState(148);
			match(GT);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ESTO) | (1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_ESTO:
					{
					setState(149);
					varDeclaration();
					}
					break;
				case KW_REDDERE:
				case KW_SI:
				case KW_DUM:
				case KW_FACERE:
				case KW_PER:
				case KW_PERGE:
				case KW_INTERRUMPE:
				case READ:
				case PRINT:
				case IDENT:
					{
					setState(150);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public RatioFunctionContext ratioFunction() {
			return getRuleContext(RatioFunctionContext.class,0);
		}
		public ActioFunctionContext actioFunction() {
			return getRuleContext(ActioFunctionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefinition);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RATIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				ratioFunction();
				}
				break;
			case KW_ACTIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				actioFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatioFunctionContext extends ParserRuleContext {
		public TerminalNode KW_RATIO() { return getToken(CodexLatinusParser.KW_RATIO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public LocalVarSectionContext localVarSection() {
			return getRuleContext(LocalVarSectionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RatioFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratioFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterRatioFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitRatioFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitRatioFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatioFunctionContext ratioFunction() throws RecognitionException {
		RatioFunctionContext _localctx = new RatioFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ratioFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(KW_RATIO);
			setState(161);
			type();
			setState(162);
			match(IDENT);
			setState(163);
			match(LPAREN);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESTO) {
				{
				setState(164);
				paramList();
				}
			}

			setState(167);
			match(RPAREN);
			setState(168);
			match(LBRACE);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_VARIABILES) {
				{
				setState(169);
				localVarSection();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(172);
				statement();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(RBRACE);
			setState(179);
			blockEnd();
			setState(180);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActioFunctionContext extends ParserRuleContext {
		public TerminalNode KW_ACTIO() { return getToken(CodexLatinusParser.KW_ACTIO, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public LocalVarSectionContext localVarSection() {
			return getRuleContext(LocalVarSectionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ActioFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actioFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterActioFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitActioFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitActioFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActioFunctionContext actioFunction() throws RecognitionException {
		ActioFunctionContext _localctx = new ActioFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actioFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(KW_ACTIO);
			setState(183);
			match(IDENT);
			setState(184);
			match(LPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESTO) {
				{
				setState(185);
				paramList();
				}
			}

			setState(188);
			match(RPAREN);
			setState(189);
			match(LBRACE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_VARIABILES) {
				{
				setState(190);
				localVarSection();
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(193);
				statement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(RBRACE);
			setState(200);
			blockEnd();
			setState(201);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			param();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				param();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(CodexLatinusParser.KW_ESTO, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(KW_ESTO);
			setState(212);
			match(IDENT);
			setState(213);
			match(COLON);
			setState(214);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVarSectionContext extends ParserRuleContext {
		public TerminalNode SEC_VARIABILES() { return getToken(CodexLatinusParser.SEC_VARIABILES, 0); }
		public TerminalNode LBRACK() { return getToken(CodexLatinusParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public LocalVarSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLocalVarSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLocalVarSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLocalVarSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarSectionContext localVarSection() throws RecognitionException {
		LocalVarSectionContext _localctx = new LocalVarSectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_localVarSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(SEC_VARIABILES);
			setState(217);
			match(LBRACK);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ESTO) | (1L << KW_SERIES) | (1L << KW_STRUCTURA))) != 0)) {
				{
				{
				setState(218);
				localDeclaration();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public StructVarDeclarationContext structVarDeclaration() {
			return getRuleContext(StructVarDeclarationContext.class,0);
		}
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_localDeclaration);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				structVarDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
			case KW_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				primitiveType();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode KW_NUMERUS() { return getToken(CodexLatinusParser.KW_NUMERUS, 0); }
		public TerminalNode KW_TEXTUM() { return getToken(CodexLatinusParser.KW_TEXTUM, 0); }
		public TerminalNode KW_DECIMALIS() { return getToken(CodexLatinusParser.KW_DECIMALIS, 0); }
		public TerminalNode KW_LITTERA() { return getToken(CodexLatinusParser.KW_LITTERA, 0); }
		public TerminalNode KW_BOOL() { return getToken(CodexLatinusParser.KW_BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_NUMERUS) | (1L << KW_TEXTUM) | (1L << KW_DECIMALIS) | (1L << KW_LITTERA) | (1L << KW_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypedVarDeclContext extends VarDeclarationContext {
		public TerminalNode KW_ESTO() { return getToken(CodexLatinusParser.KW_ESTO, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypedVarDeclContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterTypedVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitTypedVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitTypedVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolShorthandDeclContext extends VarDeclarationContext {
		public TerminalNode KW_ESTO() { return getToken(CodexLatinusParser.KW_ESTO, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public BoolShorthandDeclContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterBoolShorthandDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitBoolShorthandDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitBoolShorthandDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDeclaration);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new BoolShorthandDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(KW_ESTO);
				setState(239);
				match(IDENT);
				setState(240);
				match(COLON);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==VERUM || _la==FALSUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new TypedVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(KW_ESTO);
				setState(244);
				match(IDENT);
				setState(245);
				match(COLON);
				setState(246);
				type();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
					{
					setState(247);
					expr();
					}
				}

				setState(250);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	 
		public ArrayDeclarationContext() { }
		public void copyFrom(ArrayDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypedArrayDeclContext extends ArrayDeclarationContext {
		public TerminalNode KW_SERIES() { return getToken(CodexLatinusParser.KW_SERIES, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LBRACK() { return getToken(CodexLatinusParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public TypedArrayDeclContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterTypedArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitTypedArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitTypedArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolArrayDeclContext extends ArrayDeclarationContext {
		public TerminalNode KW_SERIES() { return getToken(CodexLatinusParser.KW_SERIES, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LBRACK() { return getToken(CodexLatinusParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CodexLatinusParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public BoolArrayDeclContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterBoolArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitBoolArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitBoolArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayDeclaration);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new TypedArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(KW_SERIES);
				setState(255);
				match(IDENT);
				setState(256);
				match(LBRACK);
				setState(257);
				expr();
				setState(258);
				match(RBRACK);
				setState(259);
				match(COLON);
				setState(260);
				arrayType();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(261);
					arrayInit();
					}
				}

				setState(264);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new BoolArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(KW_SERIES);
				setState(267);
				match(IDENT);
				setState(268);
				match(LBRACK);
				setState(269);
				expr();
				setState(270);
				match(RBRACK);
				setState(271);
				match(COLON);
				setState(272);
				arrayInit();
				setState(273);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayType);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
			case KW_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				primitiveType();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitArrayInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(LBRACE);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
				{
				setState(282);
				exprList();
				}
			}

			setState(285);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expr();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				expr();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_STRUCTURA() { return getToken(CodexLatinusParser.KW_STRUCTURA, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(KW_STRUCTURA);
			setState(296);
			match(IDENT);
			setState(297);
			match(LBRACE);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_ESTO || _la==KW_SERIES) {
				{
				{
				setState(298);
				structMember();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(RBRACE);
			setState(305);
			blockEnd();
			setState(306);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructMemberContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(CodexLatinusParser.KW_ESTO, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public MemberTypeContext memberType() {
			return getRuleContext(MemberTypeContext.class,0);
		}
		public StructMemberSepContext structMemberSep() {
			return getRuleContext(StructMemberSepContext.class,0);
		}
		public TerminalNode KW_SERIES() { return getToken(CodexLatinusParser.KW_SERIES, 0); }
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structMember);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(KW_ESTO);
				setState(309);
				match(IDENT);
				setState(310);
				match(COLON);
				setState(311);
				memberType();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==COMMA) {
					{
					setState(312);
					structMemberSep();
					}
				}

				}
				break;
			case KW_SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(KW_SERIES);
				setState(316);
				match(IDENT);
				setState(317);
				match(COLON);
				setState(318);
				memberType();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==COMMA) {
					{
					setState(319);
					structMemberSep();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructMemberSepContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(CodexLatinusParser.COMMA, 0); }
		public StructMemberSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMemberSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructMemberSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructMemberSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructMemberSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructMemberSepContext structMemberSep() throws RecognitionException {
		StructMemberSepContext _localctx = new StructMemberSepContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structMemberSep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==COMMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public MemberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMemberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMemberType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMemberType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberTypeContext memberType() throws RecognitionException {
		MemberTypeContext _localctx = new MemberTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_memberType);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
			case KW_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				primitiveType();
				}
				break;
			case VERUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(VERUM);
				}
				break;
			case FALSUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				match(FALSUS);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructVarDeclarationContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(CodexLatinusParser.KW_ESTO, 0); }
		public List<TerminalNode> IDENT() { return getTokens(CodexLatinusParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CodexLatinusParser.IDENT, i);
		}
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public StructLiteralContext structLiteral() {
			return getRuleContext(StructLiteralContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public StructVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructVarDeclarationContext structVarDeclaration() throws RecognitionException {
		StructVarDeclarationContext _localctx = new StructVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(KW_ESTO);
			setState(333);
			match(IDENT);
			setState(334);
			match(COLON);
			setState(335);
			match(IDENT);
			setState(336);
			structLiteral();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(337);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockEndContext extends ParserRuleContext {
		public TerminalNode FIN_BLOQUE() { return getToken(CodexLatinusParser.FIN_BLOQUE, 0); }
		public TerminalNode FIN_PROGRAMA() { return getToken(CodexLatinusParser.FIN_PROGRAMA, 0); }
		public BlockEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterBlockEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitBlockEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitBlockEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockEndContext blockEnd() throws RecognitionException {
		BlockEndContext _localctx = new BlockEndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !(_la==FIN_PROGRAMA || _la==FIN_BLOQUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public List<StructFieldInitContext> structFieldInit() {
			return getRuleContexts(StructFieldInitContext.class);
		}
		public StructFieldInitContext structFieldInit(int i) {
			return getRuleContext(StructFieldInitContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public StructLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructLiteralContext structLiteral() throws RecognitionException {
		StructLiteralContext _localctx = new StructLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(LBRACE);
			setState(343);
			structFieldInit();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				structFieldInit();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructFieldInitContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructFieldInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructFieldInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructFieldInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructFieldInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldInitContext structFieldInit() throws RecognitionException {
		StructFieldInitContext _localctx = new StructFieldInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structFieldInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(IDENT);
			setState(354);
			match(COLON);
			setState(355);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public DoWhileStmtContext doWhileStmt() {
			return getRuleContext(DoWhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				readStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				incDecStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				functionCallStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(366);
				returnStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(367);
				breakStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(368);
				continueStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructLiteralAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodexLatinusParser.ASSIGN, 0); }
		public StructLiteralContext structLiteral() {
			return getRuleContext(StructLiteralContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public StructLiteralAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterStructLiteralAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitStructLiteralAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitStructLiteralAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAssignmentContext extends AssignmentContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodexLatinusParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ExprAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExprAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExprAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExprAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment);
		int _la;
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ExprAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				lvalue();
				setState(372);
				match(ASSIGN);
				setState(373);
				expr();
				setState(374);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StructLiteralAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				lvalue();
				setState(377);
				match(ASSIGN);
				setState(378);
				structLiteral();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(379);
					match(SEMI);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(CodexLatinusParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CodexLatinusParser.IDENT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodexLatinusParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodexLatinusParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodexLatinusParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodexLatinusParser.LBRACK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodexLatinusParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodexLatinusParser.RBRACK, i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IDENT);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(385);
					match(DOT);
					setState(386);
					match(IDENT);
					}
					break;
				case LBRACK:
					{
					setState(387);
					match(LBRACK);
					setState(388);
					expr();
					setState(389);
					match(RBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public List<TerminalNode> PRINT() { return getTokens(CodexLatinusParser.PRINT); }
		public TerminalNode PRINT(int i) {
			return getToken(CodexLatinusParser.PRINT, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(PRINT);
			setState(397);
			expr();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT) {
				{
				{
				setState(398);
				match(PRINT);
				setState(399);
				expr();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CodexLatinusParser.READ, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_readStmt);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(READ);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(408);
					match(SEMI);
					}
				}

				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(IDENT);
				setState(412);
				match(READ);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(413);
					match(SEMI);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode KW_SI() { return getToken(CodexLatinusParser.KW_SI, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfClauseContext> elseIfClause() {
			return getRuleContexts(ElseIfClauseContext.class);
		}
		public ElseIfClauseContext elseIfClause(int i) {
			return getRuleContext(ElseIfClauseContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(KW_SI);
			setState(419);
			match(LPAREN);
			setState(420);
			expr();
			setState(421);
			match(RPAREN);
			setState(422);
			match(LBRACE);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(423);
				statement();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(RBRACE);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					elseIfClause();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ALITER) {
				{
				setState(436);
				elseClause();
				}
			}

			setState(439);
			blockEnd();
			setState(440);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfClauseContext extends ParserRuleContext {
		public TerminalNode KW_ALITER() { return getToken(CodexLatinusParser.KW_ALITER, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitElseIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitElseIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfClauseContext elseIfClause() throws RecognitionException {
		ElseIfClauseContext _localctx = new ElseIfClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(KW_ALITER);
			setState(443);
			match(LPAREN);
			setState(444);
			expr();
			setState(445);
			match(RPAREN);
			setState(446);
			match(LBRACE);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(447);
				statement();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode KW_ALITER() { return getToken(CodexLatinusParser.KW_ALITER, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(KW_ALITER);
			setState(456);
			match(LBRACE);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(457);
				statement();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode KW_DUM() { return getToken(CodexLatinusParser.KW_DUM, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public BlockEndContext blockEnd() {
			return getRuleContext(BlockEndContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(KW_DUM);
			setState(466);
			match(LPAREN);
			setState(467);
			expr();
			setState(468);
			match(RPAREN);
			setState(469);
			match(LBRACE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(470);
				statement();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(RBRACE);
			setState(477);
			blockEnd();
			setState(478);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStmtContext extends ParserRuleContext {
		public TerminalNode KW_FACERE() { return getToken(CodexLatinusParser.KW_FACERE, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public TerminalNode KW_DUM() { return getToken(CodexLatinusParser.KW_DUM, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStmtContext doWhileStmt() throws RecognitionException {
		DoWhileStmtContext _localctx = new DoWhileStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_doWhileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(KW_FACERE);
			setState(481);
			match(LBRACE);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(482);
				statement();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(RBRACE);
			setState(489);
			match(KW_DUM);
			setState(490);
			match(LPAREN);
			setState(491);
			expr();
			setState(492);
			match(RPAREN);
			setState(493);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode KW_PER() { return getToken(CodexLatinusParser.KW_PER, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CodexLatinusParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CodexLatinusParser.SEMI, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CodexLatinusParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodexLatinusParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(KW_PER);
			setState(496);
			match(LPAREN);
			setState(497);
			forInit();
			setState(498);
			match(SEMI);
			setState(499);
			expr();
			setState(500);
			match(SEMI);
			setState(501);
			forUpdate();
			setState(502);
			match(RPAREN);
			setState(503);
			match(LBRACE);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(504);
				statement();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode KW_ESTO() { return getToken(CodexLatinusParser.KW_ESTO, 0); }
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CodexLatinusParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(KW_ESTO);
			setState(513);
			match(IDENT);
			setState(514);
			match(COLON);
			setState(515);
			type();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
				{
				setState(516);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode INC() { return getToken(CodexLatinusParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodexLatinusParser.DEC, 0); }
		public TerminalNode ASSIGN() { return getToken(CodexLatinusParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forUpdate);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				lvalue();
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				lvalue();
				setState(523);
				match(ASSIGN);
				setState(524);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStmtContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public TerminalNode INC() { return getToken(CodexLatinusParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodexLatinusParser.DEC, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitIncDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			lvalue();
			setState(529);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(530);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			functionCall();
			setState(533);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(IDENT);
			setState(536);
			match(LPAREN);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
				{
				setState(537);
				argList();
				}
			}

			setState(540);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodexLatinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodexLatinusParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			expr();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543);
				match(COMMA);
				setState(544);
				expr();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode KW_REDDERE() { return getToken(CodexLatinusParser.KW_REDDERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(KW_REDDERE);
			setState(551);
			expr();
			setState(552);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode KW_INTERRUMPE() { return getToken(CodexLatinusParser.KW_INTERRUMPE, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(KW_INTERRUMPE);
			setState(555);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode KW_PERGE() { return getToken(CodexLatinusParser.KW_PERGE, 0); }
		public TerminalNode SEMI() { return getToken(CodexLatinusParser.SEMI, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(KW_PERGE);
			setState(558);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			logicalOrExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExprContext extends ParserRuleContext {
		public LogicalAndExprContext logicalAndExpr() {
			return getRuleContext(LogicalAndExprContext.class,0);
		}
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(CodexLatinusParser.OR, 0); }
		public LogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLogicalOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExprContext logicalOrExpr() throws RecognitionException {
		return logicalOrExpr(0);
	}

	private LogicalOrExprContext logicalOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExprContext _localctx = new LogicalOrExprContext(_ctx, _parentState);
		LogicalOrExprContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_logicalOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(563);
			logicalAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpr);
					setState(565);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(566);
					match(OR);
					setState(567);
					logicalAndExpr(0);
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExprContext extends ParserRuleContext {
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public LogicalAndExprContext logicalAndExpr() {
			return getRuleContext(LogicalAndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(CodexLatinusParser.AND, 0); }
		public LogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExprContext logicalAndExpr() throws RecognitionException {
		return logicalAndExpr(0);
	}

	private LogicalAndExprContext logicalAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExprContext _localctx = new LogicalAndExprContext(_ctx, _parentState);
		LogicalAndExprContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_logicalAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(574);
			equalityExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpr);
					setState(576);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(577);
					match(AND);
					setState(578);
					equalityExpr(0);
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CodexLatinusParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CodexLatinusParser.NEQ, 0); }
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		return equalityExpr(0);
	}

	private EqualityExprContext equalityExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, _parentState);
		EqualityExprContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_equalityExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(585);
			relationalExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(592);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
					setState(587);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(588);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NEQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(589);
					relationalExpr(0);
					}
					} 
				}
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public TerminalNode LT() { return getToken(CodexLatinusParser.LT, 0); }
		public TerminalNode GT() { return getToken(CodexLatinusParser.GT, 0); }
		public TerminalNode LE() { return getToken(CodexLatinusParser.LE, 0); }
		public TerminalNode GE() { return getToken(CodexLatinusParser.GE, 0); }
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		return relationalExpr(0);
	}

	private RelationalExprContext relationalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, _parentState);
		RelationalExprContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_relationalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(596);
			additiveExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
					setState(598);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(599);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(600);
					additiveExpr(0);
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CodexLatinusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		return additiveExpr(0);
	}

	private AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(607);
			multiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(609);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(610);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(611);
					multiplicativeExpr(0);
					}
					} 
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode STAR() { return getToken(CodexLatinusParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CodexLatinusParser.SLASH, 0); }
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		return multiplicativeExpr(0);
	}

	private MultiplicativeExprContext multiplicativeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, _parentState);
		MultiplicativeExprContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_multiplicativeExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(618);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
					setState(620);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(621);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==SLASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(622);
					unaryExpr();
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CodexLatinusParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CodexLatinusParser.MINUS, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unaryExpr);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				unaryExpr();
				}
				break;
			case VERUM:
			case FALSUS:
			case LPAREN:
			case DECIMAL_LIT:
			case NUMERUS_LIT:
			case TEXTUM_LIT:
			case LITTERA_LIT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				postfixExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CodexLatinusParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodexLatinusParser.DOT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(CodexLatinusParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CodexLatinusParser.IDENT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodexLatinusParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodexLatinusParser.LBRACK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodexLatinusParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodexLatinusParser.RBRACK, i);
		}
		public TerminalNode INC() { return getToken(CodexLatinusParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodexLatinusParser.DEC, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_postfixExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			atom();
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(640);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(634);
						match(DOT);
						setState(635);
						match(IDENT);
						}
						break;
					case LBRACK:
						{
						setState(636);
						match(LBRACK);
						setState(637);
						expr();
						setState(638);
						match(RBRACK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(645);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMERUS_LIT() { return getToken(CodexLatinusParser.NUMERUS_LIT, 0); }
		public TerminalNode DECIMAL_LIT() { return getToken(CodexLatinusParser.DECIMAL_LIT, 0); }
		public TerminalNode TEXTUM_LIT() { return getToken(CodexLatinusParser.TEXTUM_LIT, 0); }
		public TerminalNode LITTERA_LIT() { return getToken(CodexLatinusParser.LITTERA_LIT, 0); }
		public TerminalNode VERUM() { return getToken(CodexLatinusParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusParser.FALSUS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CodexLatinusParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusListener ) ((CodexLatinusListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusVisitor ) return ((CodexLatinusVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_atom);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(NUMERUS_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(DECIMAL_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(TEXTUM_LIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				match(LITTERA_LIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				match(VERUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				match(FALSUS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(654);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(655);
				match(IDENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(656);
				match(LPAREN);
				setState(657);
				expr();
				setState(658);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return logicalOrExpr_sempred((LogicalOrExprContext)_localctx, predIndex);
		case 49:
			return logicalAndExpr_sempred((LogicalAndExprContext)_localctx, predIndex);
		case 50:
			return equalityExpr_sempred((EqualityExprContext)_localctx, predIndex);
		case 51:
			return relationalExpr_sempred((RelationalExprContext)_localctx, predIndex);
		case 52:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 53:
			return multiplicativeExpr_sempred((MultiplicativeExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalOrExpr_sempred(LogicalOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalAndExpr_sempred(LogicalAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalityExpr_sempred(EqualityExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relationalExpr_sempred(RelationalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpr_sempred(MultiplicativeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0299\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\5\2v\n\2\3\2\5"+
		"\2y\n\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13"+
		"\3\3\4\3\4\3\4\3\4\5\4\u008c\n\4\3\5\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094"+
		"\13\5\3\6\3\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\7\3\7\5\7\u00a1"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a8\n\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\b\7"+
		"\b\u00b0\n\b\f\b\16\b\u00b3\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00bd"+
		"\n\t\3\t\3\t\3\t\5\t\u00c2\n\t\3\t\7\t\u00c5\n\t\f\t\16\t\u00c8\13\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00d1\n\n\f\n\16\n\u00d4\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00e9\n\r\3\16\3\16\5\16\u00ed\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fb\n\20\3\20\3\20"+
		"\5\20\u00ff\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0109\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116"+
		"\n\21\3\22\3\22\5\22\u011a\n\22\3\23\3\23\5\23\u011e\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u0125\n\24\f\24\16\24\u0128\13\24\3\25\3\25\3\25\3"+
		"\25\7\25\u012e\n\25\f\25\16\25\u0131\13\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u013c\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0143"+
		"\n\26\5\26\u0145\n\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u014d\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0155\n\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\7\33\u015d\n\33\f\33\16\33\u0160\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0174\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u017f\n"+
		"\36\5\36\u0181\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u018a\n\37"+
		"\f\37\16\37\u018d\13\37\3 \3 \3 \3 \7 \u0193\n \f \16 \u0196\13 \3 \3"+
		" \3!\3!\5!\u019c\n!\3!\3!\3!\5!\u01a1\n!\5!\u01a3\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\7\"\u01ab\n\"\f\"\16\"\u01ae\13\"\3\"\3\"\7\"\u01b2\n\"\f\"\16"+
		"\"\u01b5\13\"\3\"\5\"\u01b8\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u01c3"+
		"\n#\f#\16#\u01c6\13#\3#\3#\3$\3$\3$\7$\u01cd\n$\f$\16$\u01d0\13$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\7%\u01da\n%\f%\16%\u01dd\13%\3%\3%\3%\3%\3&\3&\3&"+
		"\7&\u01e6\n&\f&\16&\u01e9\13&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u01fc\n\'\f\'\16\'\u01ff\13\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\5(\u0208\n(\3)\3)\3)\3)\3)\3)\3)\5)\u0211\n)\3*\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\5,\u021d\n,\3,\3,\3-\3-\3-\7-\u0224\n-\f-\16-\u0227\13-"+
		"\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u023b\n\62\f\62\16\62\u023e\13\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\7\63\u0246\n\63\f\63\16\63\u0249\13\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\7\64\u0251\n\64\f\64\16\64\u0254\13\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\7\65\u025c\n\65\f\65\16\65\u025f\13\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u0267\n\66\f\66\16\66\u026a\13\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\7\67\u0272\n\67\f\67\16\67\u0275\13\67\38\38\38\58\u027a\n8\39\3"+
		"9\39\39\39\39\39\79\u0283\n9\f9\169\u0286\139\39\59\u0289\n9\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0297\n:\3:\2\bbdfhjl;\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnpr\2\f\3\2\26\32\3\2\33\34\3\2\65\66\3\2\6\7\3\2#$\3\2\35\36\4\2\37"+
		" +,\3\2\'(\3\2)*\4\2\25\25((\2\u02b6\2u\3\2\2\2\4\177\3\2\2\2\6\u008b"+
		"\3\2\2\2\b\u008d\3\2\2\2\n\u0095\3\2\2\2\f\u00a0\3\2\2\2\16\u00a2\3\2"+
		"\2\2\20\u00b8\3\2\2\2\22\u00cd\3\2\2\2\24\u00d5\3\2\2\2\26\u00da\3\2\2"+
		"\2\30\u00e8\3\2\2\2\32\u00ec\3\2\2\2\34\u00ee\3\2\2\2\36\u00fe\3\2\2\2"+
		" \u0115\3\2\2\2\"\u0119\3\2\2\2$\u011b\3\2\2\2&\u0121\3\2\2\2(\u0129\3"+
		"\2\2\2*\u0144\3\2\2\2,\u0146\3\2\2\2.\u014c\3\2\2\2\60\u014e\3\2\2\2\62"+
		"\u0156\3\2\2\2\64\u0158\3\2\2\2\66\u0163\3\2\2\28\u0173\3\2\2\2:\u0180"+
		"\3\2\2\2<\u0182\3\2\2\2>\u018e\3\2\2\2@\u01a2\3\2\2\2B\u01a4\3\2\2\2D"+
		"\u01bc\3\2\2\2F\u01c9\3\2\2\2H\u01d3\3\2\2\2J\u01e2\3\2\2\2L\u01f1\3\2"+
		"\2\2N\u0202\3\2\2\2P\u0210\3\2\2\2R\u0212\3\2\2\2T\u0216\3\2\2\2V\u0219"+
		"\3\2\2\2X\u0220\3\2\2\2Z\u0228\3\2\2\2\\\u022c\3\2\2\2^\u022f\3\2\2\2"+
		"`\u0232\3\2\2\2b\u0234\3\2\2\2d\u023f\3\2\2\2f\u024a\3\2\2\2h\u0255\3"+
		"\2\2\2j\u0260\3\2\2\2l\u026b\3\2\2\2n\u0279\3\2\2\2p\u027b\3\2\2\2r\u0296"+
		"\3\2\2\2tv\5\4\3\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\5\b\5\2xw\3\2\2\2x"+
		"y\3\2\2\2yz\3\2\2\2z{\5\n\6\2{|\7\6\2\2|}\7\65\2\2}~\7\2\2\3~\3\3\2\2"+
		"\2\177\u0080\7\3\2\2\u0080\u0084\7,\2\2\u0081\u0083\5\6\4\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\5\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008c\5\36\20\2\u0088\u008c\5 \21"+
		"\2\u0089\u008c\5(\25\2\u008a\u008c\5\60\31\2\u008b\u0087\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\7\3\2\2\2"+
		"\u008d\u008e\7\4\2\2\u008e\u0092\7,\2\2\u008f\u0091\5\f\7\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\5\2\2\u0096\u009b\7,\2\2"+
		"\u0097\u009a\5\36\20\2\u0098\u009a\58\35\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\13\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\5\16\b\2\u009f\u00a1\5\20"+
		"\t\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3"+
		"\7\13\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7<\2\2\u00a5\u00a7\7.\2\2"+
		"\u00a6\u00a8\5\22\n\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00ad\5\26\f\2"+
		"\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0"+
		"\58\35\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\61"+
		"\2\2\u00b5\u00b6\5\62\32\2\u00b6\u00b7\7\65\2\2\u00b7\17\3\2\2\2\u00b8"+
		"\u00b9\7\f\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bc\7.\2\2\u00bb\u00bd\5\22"+
		"\n\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7/\2\2\u00bf\u00c1\7\60\2\2\u00c0\u00c2\5\26\f\2\u00c1\u00c0\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\58\35\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca"+
		"\u00cb\5\62\32\2\u00cb\u00cc\7\65\2\2\u00cc\21\3\2\2\2\u00cd\u00d2\5\24"+
		"\13\2\u00ce\u00cf\7\66\2\2\u00cf\u00d1\5\24\13\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\23\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\7<\2\2\u00d7\u00d8"+
		"\7\64\2\2\u00d8\u00d9\5\32\16\2\u00d9\25\3\2\2\2\u00da\u00db\7\3\2\2\u00db"+
		"\u00df\7\62\2\2\u00dc\u00de\5\30\r\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7\63\2\2\u00e3\27\3\2\2\2\u00e4\u00e9\5\36"+
		"\20\2\u00e5\u00e9\5 \21\2\u00e6\u00e9\5(\25\2\u00e7\u00e9\5\60\31\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\31\3\2\2\2\u00ea\u00ed\5\34\17\2\u00eb\u00ed\7<\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef"+
		"\35\3\2\2\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\7<\2\2\u00f2\u00f3\7\64\2"+
		"\2\u00f3\u00f4\t\3\2\2\u00f4\u00ff\7\65\2\2\u00f5\u00f6\7\b\2\2\u00f6"+
		"\u00f7\7<\2\2\u00f7\u00f8\7\64\2\2\u00f8\u00fa\5\32\16\2\u00f9\u00fb\5"+
		"`\61\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7\65\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f0\3\2\2\2\u00fe\u00f5\3"+
		"\2\2\2\u00ff\37\3\2\2\2\u0100\u0101\7\t\2\2\u0101\u0102\7<\2\2\u0102\u0103"+
		"\7\62\2\2\u0103\u0104\5`\61\2\u0104\u0105\7\63\2\2\u0105\u0106\7\64\2"+
		"\2\u0106\u0108\5\"\22\2\u0107\u0109\5$\23\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\65\2\2\u010b\u0116\3"+
		"\2\2\2\u010c\u010d\7\t\2\2\u010d\u010e\7<\2\2\u010e\u010f\7\62\2\2\u010f"+
		"\u0110\5`\61\2\u0110\u0111\7\63\2\2\u0111\u0112\7\64\2\2\u0112\u0113\5"+
		"$\23\2\u0113\u0114\7\65\2\2\u0114\u0116\3\2\2\2\u0115\u0100\3\2\2\2\u0115"+
		"\u010c\3\2\2\2\u0116!\3\2\2\2\u0117\u011a\5\34\17\2\u0118\u011a\7<\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a#\3\2\2\2\u011b\u011d\7"+
		"\60\2\2\u011c\u011e\5&\24\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7\61\2\2\u0120%\3\2\2\2\u0121\u0126\5`\61\2"+
		"\u0122\u0123\7\66\2\2\u0123\u0125\5`\61\2\u0124\u0122\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\'\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\7\n\2\2\u012a\u012b\7<\2\2\u012b\u012f\7\60"+
		"\2\2\u012c\u012e\5*\26\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u0133\7\61\2\2\u0133\u0134\5\62\32\2\u0134\u0135\7\65\2\2\u0135"+
		")\3\2\2\2\u0136\u0137\7\b\2\2\u0137\u0138\7<\2\2\u0138\u0139\7\64\2\2"+
		"\u0139\u013b\5.\30\2\u013a\u013c\5,\27\2\u013b\u013a\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u0145\3\2\2\2\u013d\u013e\7\t\2\2\u013e\u013f\7<\2\2\u013f"+
		"\u0140\7\64\2\2\u0140\u0142\5.\30\2\u0141\u0143\5,\27\2\u0142\u0141\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0136\3\2\2\2\u0144"+
		"\u013d\3\2\2\2\u0145+\3\2\2\2\u0146\u0147\t\4\2\2\u0147-\3\2\2\2\u0148"+
		"\u014d\5\34\17\2\u0149\u014d\7\33\2\2\u014a\u014d\7\34\2\2\u014b\u014d"+
		"\7<\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d/\3\2\2\2\u014e\u014f\7\b\2\2\u014f\u0150\7<\2\2\u0150"+
		"\u0151\7\64\2\2\u0151\u0152\7<\2\2\u0152\u0154\5\64\33\2\u0153\u0155\7"+
		"\65\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\61\3\2\2\2\u0156"+
		"\u0157\t\5\2\2\u0157\63\3\2\2\2\u0158\u0159\7\60\2\2\u0159\u015e\5\66"+
		"\34\2\u015a\u015b\7\66\2\2\u015b\u015d\5\66\34\2\u015c\u015a\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\61\2\2\u0162\65\3\2\2\2\u0163\u0164"+
		"\7<\2\2\u0164\u0165\7\64\2\2\u0165\u0166\5`\61\2\u0166\67\3\2\2\2\u0167"+
		"\u0174\5:\36\2\u0168\u0174\5> \2\u0169\u0174\5@!\2\u016a\u0174\5B\"\2"+
		"\u016b\u0174\5H%\2\u016c\u0174\5J&\2\u016d\u0174\5L\'\2\u016e\u0174\5"+
		"R*\2\u016f\u0174\5T+\2\u0170\u0174\5Z.\2\u0171\u0174\5\\/\2\u0172\u0174"+
		"\5^\60\2\u0173\u0167\3\2\2\2\u0173\u0168\3\2\2\2\u0173\u0169\3\2\2\2\u0173"+
		"\u016a\3\2\2\2\u0173\u016b\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016d\3\2"+
		"\2\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u01749\3\2\2\2\u0175\u0176\5<\37\2"+
		"\u0176\u0177\7-\2\2\u0177\u0178\5`\61\2\u0178\u0179\7\65\2\2\u0179\u0181"+
		"\3\2\2\2\u017a\u017b\5<\37\2\u017b\u017c\7-\2\2\u017c\u017e\5\64\33\2"+
		"\u017d\u017f\7\65\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181"+
		"\3\2\2\2\u0180\u0175\3\2\2\2\u0180\u017a\3\2\2\2\u0181;\3\2\2\2\u0182"+
		"\u018b\7<\2\2\u0183\u0184\7\67\2\2\u0184\u018a\7<\2\2\u0185\u0186\7\62"+
		"\2\2\u0186\u0187\5`\61\2\u0187\u0188\7\63\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0183\3\2\2\2\u0189\u0185\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c=\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f"+
		"\7&\2\2\u018f\u0194\5`\61\2\u0190\u0191\7&\2\2\u0191\u0193\5`\61\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\7\65\2\2\u0198"+
		"?\3\2\2\2\u0199\u019b\7%\2\2\u019a\u019c\7\65\2\2\u019b\u019a\3\2\2\2"+
		"\u019b\u019c\3\2\2\2\u019c\u01a3\3\2\2\2\u019d\u019e\7<\2\2\u019e\u01a0"+
		"\7%\2\2\u019f\u01a1\7\65\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3A\3\2\2\2"+
		"\u01a4\u01a5\7\16\2\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\5`\61\2\u01a7\u01a8"+
		"\7/\2\2\u01a8\u01ac\7\60\2\2\u01a9\u01ab\58\35\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b3\7\61\2\2\u01b0\u01b2\5D#\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5F$\2\u01b7\u01b6"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5\62\32\2"+
		"\u01ba\u01bb\7\65\2\2\u01bbC\3\2\2\2\u01bc\u01bd\7\17\2\2\u01bd\u01be"+
		"\7.\2\2\u01be\u01bf\5`\61\2\u01bf\u01c0\7/\2\2\u01c0\u01c4\7\60\2\2\u01c1"+
		"\u01c3\58\35\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\7\61\2\2\u01c8E\3\2\2\2\u01c9\u01ca\7\17\2\2\u01ca\u01ce\7\60\2"+
		"\2\u01cb\u01cd\58\35\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d2\7\61\2\2\u01d2G\3\2\2\2\u01d3\u01d4\7\20\2\2\u01d4\u01d5\7.\2\2"+
		"\u01d5\u01d6\5`\61\2\u01d6\u01d7\7/\2\2\u01d7\u01db\7\60\2\2\u01d8\u01da"+
		"\58\35\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\61"+
		"\2\2\u01df\u01e0\5\62\32\2\u01e0\u01e1\7\65\2\2\u01e1I\3\2\2\2\u01e2\u01e3"+
		"\7\21\2\2\u01e3\u01e7\7\60\2\2\u01e4\u01e6\58\35\2\u01e5\u01e4\3\2\2\2"+
		"\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\7\20\2\2"+
		"\u01ec\u01ed\7.\2\2\u01ed\u01ee\5`\61\2\u01ee\u01ef\7/\2\2\u01ef\u01f0"+
		"\7\65\2\2\u01f0K\3\2\2\2\u01f1\u01f2\7\22\2\2\u01f2\u01f3\7.\2\2\u01f3"+
		"\u01f4\5N(\2\u01f4\u01f5\7\65\2\2\u01f5\u01f6\5`\61\2\u01f6\u01f7\7\65"+
		"\2\2\u01f7\u01f8\5P)\2\u01f8\u01f9\7/\2\2\u01f9\u01fd\7\60\2\2\u01fa\u01fc"+
		"\58\35\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\61"+
		"\2\2\u0201M\3\2\2\2\u0202\u0203\7\b\2\2\u0203\u0204\7<\2\2\u0204\u0205"+
		"\7\64\2\2\u0205\u0207\5\32\16\2\u0206\u0208\5`\61\2\u0207\u0206\3\2\2"+
		"\2\u0207\u0208\3\2\2\2\u0208O\3\2\2\2\u0209\u020a\5<\37\2\u020a\u020b"+
		"\t\6\2\2\u020b\u0211\3\2\2\2\u020c\u020d\5<\37\2\u020d\u020e\7-\2\2\u020e"+
		"\u020f\5`\61\2\u020f\u0211\3\2\2\2\u0210\u0209\3\2\2\2\u0210\u020c\3\2"+
		"\2\2\u0211Q\3\2\2\2\u0212\u0213\5<\37\2\u0213\u0214\t\6\2\2\u0214\u0215"+
		"\7\65\2\2\u0215S\3\2\2\2\u0216\u0217\5V,\2\u0217\u0218\7\65\2\2\u0218"+
		"U\3\2\2\2\u0219\u021a\7<\2\2\u021a\u021c\7.\2\2\u021b\u021d\5X-\2\u021c"+
		"\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7/"+
		"\2\2\u021fW\3\2\2\2\u0220\u0225\5`\61\2\u0221\u0222\7\66\2\2\u0222\u0224"+
		"\5`\61\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226Y\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7\r\2\2"+
		"\u0229\u022a\5`\61\2\u022a\u022b\7\65\2\2\u022b[\3\2\2\2\u022c\u022d\7"+
		"\24\2\2\u022d\u022e\7\65\2\2\u022e]\3\2\2\2\u022f\u0230\7\23\2\2\u0230"+
		"\u0231\7\65\2\2\u0231_\3\2\2\2\u0232\u0233\5b\62\2\u0233a\3\2\2\2\u0234"+
		"\u0235\b\62\1\2\u0235\u0236\5d\63\2\u0236\u023c\3\2\2\2\u0237\u0238\f"+
		"\4\2\2\u0238\u0239\7\"\2\2\u0239\u023b\5d\63\2\u023a\u0237\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023dc\3\2\2\2"+
		"\u023e\u023c\3\2\2\2\u023f\u0240\b\63\1\2\u0240\u0241\5f\64\2\u0241\u0247"+
		"\3\2\2\2\u0242\u0243\f\4\2\2\u0243\u0244\7!\2\2\u0244\u0246\5f\64\2\u0245"+
		"\u0242\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248e\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\b\64\1\2\u024b\u024c"+
		"\5h\65\2\u024c\u0252\3\2\2\2\u024d\u024e\f\4\2\2\u024e\u024f\t\7\2\2\u024f"+
		"\u0251\5h\65\2\u0250\u024d\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253g\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256"+
		"\b\65\1\2\u0256\u0257\5j\66\2\u0257\u025d\3\2\2\2\u0258\u0259\f\4\2\2"+
		"\u0259\u025a\t\b\2\2\u025a\u025c\5j\66\2\u025b\u0258\3\2\2\2\u025c\u025f"+
		"\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025ei\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0261\b\66\1\2\u0261\u0262\5l\67\2\u0262\u0268\3"+
		"\2\2\2\u0263\u0264\f\4\2\2\u0264\u0265\t\t\2\2\u0265\u0267\5l\67\2\u0266"+
		"\u0263\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269k\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\b\67\1\2\u026c\u026d"+
		"\5n8\2\u026d\u0273\3\2\2\2\u026e\u026f\f\4\2\2\u026f\u0270\t\n\2\2\u0270"+
		"\u0272\5n8\2\u0271\u026e\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2"+
		"\2\u0273\u0274\3\2\2\2\u0274m\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277"+
		"\t\13\2\2\u0277\u027a\5n8\2\u0278\u027a\5p9\2\u0279\u0276\3\2\2\2\u0279"+
		"\u0278\3\2\2\2\u027ao\3\2\2\2\u027b\u0284\5r:\2\u027c\u027d\7\67\2\2\u027d"+
		"\u0283\7<\2\2\u027e\u027f\7\62\2\2\u027f\u0280\5`\61\2\u0280\u0281\7\63"+
		"\2\2\u0281\u0283\3\2\2\2\u0282\u027c\3\2\2\2\u0282\u027e\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0288\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0287\u0289\t\6\2\2\u0288\u0287\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289q\3\2\2\2\u028a\u0297\79\2\2\u028b\u0297\78\2\2\u028c"+
		"\u0297\7:\2\2\u028d\u0297\7;\2\2\u028e\u0297\7\33\2\2\u028f\u0297\7\34"+
		"\2\2\u0290\u0297\5V,\2\u0291\u0297\7<\2\2\u0292\u0293\7.\2\2\u0293\u0294"+
		"\5`\61\2\u0294\u0295\7/\2\2\u0295\u0297\3\2\2\2\u0296\u028a\3\2\2\2\u0296"+
		"\u028b\3\2\2\2\u0296\u028c\3\2\2\2\u0296\u028d\3\2\2\2\u0296\u028e\3\2"+
		"\2\2\u0296\u028f\3\2\2\2\u0296\u0290\3\2\2\2\u0296\u0291\3\2\2\2\u0296"+
		"\u0292\3\2\2\2\u0297s\3\2\2\2Bux\u0084\u008b\u0092\u0099\u009b\u00a0\u00a7"+
		"\u00ac\u00b1\u00bc\u00c1\u00c6\u00d2\u00df\u00e8\u00ec\u00fa\u00fe\u0108"+
		"\u0115\u0119\u011d\u0126\u012f\u013b\u0142\u0144\u014c\u0154\u015e\u0173"+
		"\u017e\u0180\u0189\u018b\u0194\u019b\u01a0\u01a2\u01ac\u01b3\u01b7\u01c4"+
		"\u01ce\u01db\u01e7\u01fd\u0207\u0210\u021c\u0225\u023c\u0247\u0252\u025d"+
		"\u0268\u0273\u0279\u0282\u0284\u0288\u0296";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}