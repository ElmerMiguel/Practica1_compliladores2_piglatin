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
		RULE_structVarDeclaration = 23, RULE_structLiteral = 24, RULE_structFieldInit = 25, 
		RULE_statement = 26, RULE_assignment = 27, RULE_lvalue = 28, RULE_printStmt = 29, 
		RULE_readStmt = 30, RULE_ifStmt = 31, RULE_elseIfClause = 32, RULE_elseClause = 33, 
		RULE_whileStmt = 34, RULE_doWhileStmt = 35, RULE_forStmt = 36, RULE_forInit = 37, 
		RULE_forUpdate = 38, RULE_incDecStmt = 39, RULE_functionCallStmt = 40, 
		RULE_functionCall = 41, RULE_argList = 42, RULE_returnStmt = 43, RULE_breakStmt = 44, 
		RULE_continueStmt = 45, RULE_expr = 46, RULE_logicalOrExpr = 47, RULE_logicalAndExpr = 48, 
		RULE_equalityExpr = 49, RULE_relationalExpr = 50, RULE_additiveExpr = 51, 
		RULE_multiplicativeExpr = 52, RULE_unaryExpr = 53, RULE_postfixExpr = 54, 
		RULE_atom = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globalSection", "globalDeclaration", "funcSection", "mainSection", 
			"functionDefinition", "ratioFunction", "actioFunction", "paramList", 
			"param", "localVarSection", "localDeclaration", "type", "primitiveType", 
			"varDeclaration", "arrayDeclaration", "arrayType", "arrayInit", "exprList", 
			"structDefinition", "structMember", "structMemberSep", "memberType", 
			"structVarDeclaration", "structLiteral", "structFieldInit", "statement", 
			"assignment", "lvalue", "printStmt", "readStmt", "ifStmt", "elseIfClause", 
			"elseClause", "whileStmt", "doWhileStmt", "forStmt", "forInit", "forUpdate", 
			"incDecStmt", "functionCallStmt", "functionCall", "argList", "returnStmt", 
			"breakStmt", "continueStmt", "expr", "logicalOrExpr", "logicalAndExpr", 
			"equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", 
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_VARIABILES) {
				{
				setState(112);
				globalSection();
				}
			}

			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_MUNERA) {
				{
				setState(115);
				funcSection();
				}
			}

			setState(118);
			mainSection();
			setState(119);
			match(FIN_PROGRAMA);
			setState(120);
			match(SEMI);
			setState(121);
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
			setState(123);
			match(SEC_VARIABILES);
			setState(124);
			match(GT);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ESTO) | (1L << KW_SERIES) | (1L << KW_STRUCTURA))) != 0)) {
				{
				{
				setState(125);
				globalDeclaration();
				}
				}
				setState(130);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
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
			setState(137);
			match(SEC_MUNERA);
			setState(138);
			match(GT);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_RATIO || _la==KW_ACTIO) {
				{
				{
				setState(139);
				functionDefinition();
				}
				}
				setState(144);
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
			setState(145);
			match(SEC_MAIOR);
			setState(146);
			match(GT);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ESTO) | (1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_ESTO:
					{
					setState(147);
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
					setState(148);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(153);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RATIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				ratioFunction();
				}
				break;
			case KW_ACTIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
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
		public TerminalNode FIN_BLOQUE() { return getToken(CodexLatinusParser.FIN_BLOQUE, 0); }
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
			setState(158);
			match(KW_RATIO);
			setState(159);
			type();
			setState(160);
			match(IDENT);
			setState(161);
			match(LPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESTO) {
				{
				setState(162);
				paramList();
				}
			}

			setState(165);
			match(RPAREN);
			setState(166);
			match(LBRACE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_VARIABILES) {
				{
				setState(167);
				localVarSection();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RBRACE);
			setState(177);
			match(FIN_BLOQUE);
			setState(178);
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
		public TerminalNode FIN_BLOQUE() { return getToken(CodexLatinusParser.FIN_BLOQUE, 0); }
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
			setState(180);
			match(KW_ACTIO);
			setState(181);
			match(IDENT);
			setState(182);
			match(LPAREN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESTO) {
				{
				setState(183);
				paramList();
				}
			}

			setState(186);
			match(RPAREN);
			setState(187);
			match(LBRACE);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEC_VARIABILES) {
				{
				setState(188);
				localVarSection();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(RBRACE);
			setState(198);
			match(FIN_BLOQUE);
			setState(199);
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
			setState(201);
			param();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				param();
				}
				}
				setState(208);
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
			setState(209);
			match(KW_ESTO);
			setState(210);
			match(IDENT);
			setState(211);
			match(COLON);
			setState(212);
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
			setState(214);
			match(SEC_VARIABILES);
			setState(215);
			match(LBRACK);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ESTO) | (1L << KW_SERIES) | (1L << KW_STRUCTURA))) != 0)) {
				{
				{
				setState(216);
				localDeclaration();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				arrayDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
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
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
			case KW_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				primitiveType();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
			setState(234);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new BoolShorthandDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(KW_ESTO);
				setState(237);
				match(IDENT);
				setState(238);
				match(COLON);
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==VERUM || _la==FALSUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new TypedVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(KW_ESTO);
				setState(242);
				match(IDENT);
				setState(243);
				match(COLON);
				setState(244);
				type();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
					{
					setState(245);
					expr();
					}
				}

				setState(248);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new TypedArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(KW_SERIES);
				setState(253);
				match(IDENT);
				setState(254);
				match(LBRACK);
				setState(255);
				expr();
				setState(256);
				match(RBRACK);
				setState(257);
				match(COLON);
				setState(258);
				arrayType();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(259);
					arrayInit();
					}
				}

				setState(262);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new BoolArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(KW_SERIES);
				setState(265);
				match(IDENT);
				setState(266);
				match(LBRACK);
				setState(267);
				expr();
				setState(268);
				match(RBRACK);
				setState(269);
				match(COLON);
				setState(270);
				arrayInit();
				setState(271);
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
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
			case KW_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				primitiveType();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
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
			setState(279);
			match(LBRACE);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
				{
				setState(280);
				exprList();
				}
			}

			setState(283);
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
			setState(285);
			expr();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				expr();
				}
				}
				setState(292);
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
		public TerminalNode FIN_BLOQUE() { return getToken(CodexLatinusParser.FIN_BLOQUE, 0); }
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
			setState(293);
			match(KW_STRUCTURA);
			setState(294);
			match(IDENT);
			setState(295);
			match(LBRACE);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_ESTO || _la==KW_SERIES) {
				{
				{
				setState(296);
				structMember();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(RBRACE);
			setState(303);
			match(FIN_BLOQUE);
			setState(304);
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
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(KW_ESTO);
				setState(307);
				match(IDENT);
				setState(308);
				match(COLON);
				setState(309);
				memberType();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==COMMA) {
					{
					setState(310);
					structMemberSep();
					}
				}

				}
				break;
			case KW_SERIES:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(KW_SERIES);
				setState(314);
				match(IDENT);
				setState(315);
				match(COLON);
				setState(316);
				memberType();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==COMMA) {
					{
					setState(317);
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
			setState(322);
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
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NUMERUS:
			case KW_TEXTUM:
			case KW_DECIMALIS:
			case KW_LITTERA:
			case KW_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				primitiveType();
				}
				break;
			case VERUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(VERUM);
				}
				break;
			case FALSUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(FALSUS);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(KW_ESTO);
			setState(331);
			match(IDENT);
			setState(332);
			match(COLON);
			setState(333);
			match(IDENT);
			setState(334);
			structLiteral();
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
		enterRule(_localctx, 48, RULE_structLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LBRACE);
			setState(337);
			structFieldInit();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(338);
				match(COMMA);
				setState(339);
				structFieldInit();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
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
		enterRule(_localctx, 50, RULE_structFieldInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IDENT);
			setState(348);
			match(COLON);
			setState(349);
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
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				readStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				doWhileStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(358);
				incDecStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(359);
				functionCallStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(360);
				returnStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(361);
				breakStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(362);
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
		enterRule(_localctx, 54, RULE_assignment);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new ExprAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				lvalue();
				setState(366);
				match(ASSIGN);
				setState(367);
				expr();
				setState(368);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new StructLiteralAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				lvalue();
				setState(371);
				match(ASSIGN);
				setState(372);
				structLiteral();
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
		enterRule(_localctx, 56, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(IDENT);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(383);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(377);
					match(DOT);
					setState(378);
					match(IDENT);
					}
					break;
				case LBRACK:
					{
					setState(379);
					match(LBRACK);
					setState(380);
					expr();
					setState(381);
					match(RBRACK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(387);
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
		enterRule(_localctx, 58, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(PRINT);
			setState(389);
			expr();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT) {
				{
				{
				setState(390);
				match(PRINT);
				setState(391);
				expr();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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
		enterRule(_localctx, 60, RULE_readStmt);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(READ);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(IDENT);
				setState(401);
				match(READ);
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
		public TerminalNode FIN_BLOQUE() { return getToken(CodexLatinusParser.FIN_BLOQUE, 0); }
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
		enterRule(_localctx, 62, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(KW_SI);
			setState(405);
			match(LPAREN);
			setState(406);
			expr();
			setState(407);
			match(RPAREN);
			setState(408);
			match(LBRACE);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(409);
				statement();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			match(RBRACE);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					elseIfClause();
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ALITER) {
				{
				setState(422);
				elseClause();
				}
			}

			setState(425);
			match(FIN_BLOQUE);
			setState(426);
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
		enterRule(_localctx, 64, RULE_elseIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(KW_ALITER);
			setState(429);
			match(LPAREN);
			setState(430);
			expr();
			setState(431);
			match(RPAREN);
			setState(432);
			match(LBRACE);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(433);
				statement();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
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
		enterRule(_localctx, 66, RULE_elseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(KW_ALITER);
			setState(442);
			match(LBRACE);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(443);
				statement();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
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
		public TerminalNode FIN_BLOQUE() { return getToken(CodexLatinusParser.FIN_BLOQUE, 0); }
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
		enterRule(_localctx, 68, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(KW_DUM);
			setState(452);
			match(LPAREN);
			setState(453);
			expr();
			setState(454);
			match(RPAREN);
			setState(455);
			match(LBRACE);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(456);
				statement();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			match(RBRACE);
			setState(463);
			match(FIN_BLOQUE);
			setState(464);
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
		enterRule(_localctx, 70, RULE_doWhileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(KW_FACERE);
			setState(467);
			match(LBRACE);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(468);
				statement();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(RBRACE);
			setState(475);
			match(KW_DUM);
			setState(476);
			match(LPAREN);
			setState(477);
			expr();
			setState(478);
			match(RPAREN);
			setState(479);
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
		enterRule(_localctx, 72, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(KW_PER);
			setState(482);
			match(LPAREN);
			setState(483);
			forInit();
			setState(484);
			match(SEMI);
			setState(485);
			expr();
			setState(486);
			match(SEMI);
			setState(487);
			forUpdate();
			setState(488);
			match(RPAREN);
			setState(489);
			match(LBRACE);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_REDDERE) | (1L << KW_SI) | (1L << KW_DUM) | (1L << KW_FACERE) | (1L << KW_PER) | (1L << KW_PERGE) | (1L << KW_INTERRUMPE) | (1L << READ) | (1L << PRINT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(490);
				statement();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
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
		enterRule(_localctx, 74, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(KW_ESTO);
			setState(499);
			match(IDENT);
			setState(500);
			match(COLON);
			setState(501);
			type();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
				{
				setState(502);
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
		enterRule(_localctx, 76, RULE_forUpdate);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				lvalue();
				setState(506);
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
				setState(508);
				lvalue();
				setState(509);
				match(ASSIGN);
				setState(510);
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
		enterRule(_localctx, 78, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			lvalue();
			setState(515);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(516);
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
		enterRule(_localctx, 80, RULE_functionCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			functionCall();
			setState(519);
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
		enterRule(_localctx, 82, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(IDENT);
			setState(522);
			match(LPAREN);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << VERUM) | (1L << FALSUS) | (1L << MINUS) | (1L << LPAREN) | (1L << DECIMAL_LIT) | (1L << NUMERUS_LIT) | (1L << TEXTUM_LIT) | (1L << LITTERA_LIT) | (1L << IDENT))) != 0)) {
				{
				setState(523);
				argList();
				}
			}

			setState(526);
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
		enterRule(_localctx, 84, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			expr();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(529);
				match(COMMA);
				setState(530);
				expr();
				}
				}
				setState(535);
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
		enterRule(_localctx, 86, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(KW_REDDERE);
			setState(537);
			expr();
			setState(538);
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
		enterRule(_localctx, 88, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(KW_INTERRUMPE);
			setState(541);
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
		enterRule(_localctx, 90, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(KW_PERGE);
			setState(544);
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
		enterRule(_localctx, 92, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_logicalOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(549);
			logicalAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpr);
					setState(551);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(552);
					match(OR);
					setState(553);
					logicalAndExpr(0);
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_logicalAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(560);
			equalityExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpr);
					setState(562);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(563);
					match(AND);
					setState(564);
					equalityExpr(0);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_equalityExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(571);
			relationalExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
					setState(573);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(574);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NEQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(575);
					relationalExpr(0);
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_relationalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(582);
			additiveExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpr);
					setState(584);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(585);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << LT) | (1L << GT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(586);
					additiveExpr(0);
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(593);
			multiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(595);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(596);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(597);
					multiplicativeExpr(0);
					}
					} 
				}
				setState(602);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_multiplicativeExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(604);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
					setState(606);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(607);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==SLASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(608);
					unaryExpr();
					}
					} 
				}
				setState(613);
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
		enterRule(_localctx, 106, RULE_unaryExpr);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(615);
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
				setState(616);
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
		enterRule(_localctx, 108, RULE_postfixExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			atom();
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(626);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(620);
						match(DOT);
						setState(621);
						match(IDENT);
						}
						break;
					case LBRACK:
						{
						setState(622);
						match(LBRACK);
						setState(623);
						expr();
						setState(624);
						match(RBRACK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(631);
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
		enterRule(_localctx, 110, RULE_atom);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(NUMERUS_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(DECIMAL_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				match(TEXTUM_LIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				match(LITTERA_LIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				match(VERUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				match(FALSUS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(640);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(641);
				match(IDENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(642);
				match(LPAREN);
				setState(643);
				expr();
				setState(644);
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
		case 47:
			return logicalOrExpr_sempred((LogicalOrExprContext)_localctx, predIndex);
		case 48:
			return logicalAndExpr_sempred((LogicalAndExprContext)_localctx, predIndex);
		case 49:
			return equalityExpr_sempred((EqualityExprContext)_localctx, predIndex);
		case 50:
			return relationalExpr_sempred((RelationalExprContext)_localctx, predIndex);
		case 51:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 52:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u028b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\5\2t\n\2\3\2\5\2w\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3"+
		"\4\3\4\3\4\3\4\5\4\u008a\n\4\3\5\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092"+
		"\13\5\3\6\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\7\3\7\5\7\u009f"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\b\7"+
		"\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00bb"+
		"\n\t\3\t\3\t\3\t\5\t\u00c0\n\t\3\t\7\t\u00c3\n\t\f\t\16\t\u00c6\13\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00cf\n\n\f\n\16\n\u00d2\13\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00dc\n\f\f\f\16\f\u00df\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\5\r\u00e7\n\r\3\16\3\16\5\16\u00eb\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\20\3\20"+
		"\5\20\u00fd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0114"+
		"\n\21\3\22\3\22\5\22\u0118\n\22\3\23\3\23\5\23\u011c\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u0123\n\24\f\24\16\24\u0126\13\24\3\25\3\25\3\25\3"+
		"\25\7\25\u012c\n\25\f\25\16\25\u012f\13\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u013a\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0141"+
		"\n\26\5\26\u0143\n\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u014b\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0157\n\32\f\32"+
		"\16\32\u015a\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016e\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0179\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u0182\n\36\f\36\16\36\u0185\13\36\3\37\3\37\3\37\3\37"+
		"\7\37\u018b\n\37\f\37\16\37\u018e\13\37\3\37\3\37\3 \3 \3 \5 \u0195\n"+
		" \3!\3!\3!\3!\3!\3!\7!\u019d\n!\f!\16!\u01a0\13!\3!\3!\7!\u01a4\n!\f!"+
		"\16!\u01a7\13!\3!\5!\u01aa\n!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01b5"+
		"\n\"\f\"\16\"\u01b8\13\"\3\"\3\"\3#\3#\3#\7#\u01bf\n#\f#\16#\u01c2\13"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u01cc\n$\f$\16$\u01cf\13$\3$\3$\3$\3$\3%"+
		"\3%\3%\7%\u01d8\n%\f%\16%\u01db\13%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\7&\u01ee\n&\f&\16&\u01f1\13&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u01fa\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u0203\n(\3)\3)\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\5+\u020f\n+\3+\3+\3,\3,\3,\7,\u0216\n,\f,\16,\u0219\13,\3-"+
		"\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\7"+
		"\61\u022d\n\61\f\61\16\61\u0230\13\61\3\62\3\62\3\62\3\62\3\62\3\62\7"+
		"\62\u0238\n\62\f\62\16\62\u023b\13\62\3\63\3\63\3\63\3\63\3\63\3\63\7"+
		"\63\u0243\n\63\f\63\16\63\u0246\13\63\3\64\3\64\3\64\3\64\3\64\3\64\7"+
		"\64\u024e\n\64\f\64\16\64\u0251\13\64\3\65\3\65\3\65\3\65\3\65\3\65\7"+
		"\65\u0259\n\65\f\65\16\65\u025c\13\65\3\66\3\66\3\66\3\66\3\66\3\66\7"+
		"\66\u0264\n\66\f\66\16\66\u0267\13\66\3\67\3\67\3\67\5\67\u026c\n\67\3"+
		"8\38\38\38\38\38\38\78\u0275\n8\f8\168\u0278\138\38\58\u027b\n8\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\59\u0289\n9\39\2\b`bdfhj:\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnp\2\13\3\2\26\32\3\2\33\34\3\2\65\66\3\2#$\3\2\35\36\4\2\37 +,\3"+
		"\2\'(\3\2)*\4\2\25\25((\2\u02a5\2s\3\2\2\2\4}\3\2\2\2\6\u0089\3\2\2\2"+
		"\b\u008b\3\2\2\2\n\u0093\3\2\2\2\f\u009e\3\2\2\2\16\u00a0\3\2\2\2\20\u00b6"+
		"\3\2\2\2\22\u00cb\3\2\2\2\24\u00d3\3\2\2\2\26\u00d8\3\2\2\2\30\u00e6\3"+
		"\2\2\2\32\u00ea\3\2\2\2\34\u00ec\3\2\2\2\36\u00fc\3\2\2\2 \u0113\3\2\2"+
		"\2\"\u0117\3\2\2\2$\u0119\3\2\2\2&\u011f\3\2\2\2(\u0127\3\2\2\2*\u0142"+
		"\3\2\2\2,\u0144\3\2\2\2.\u014a\3\2\2\2\60\u014c\3\2\2\2\62\u0152\3\2\2"+
		"\2\64\u015d\3\2\2\2\66\u016d\3\2\2\28\u0178\3\2\2\2:\u017a\3\2\2\2<\u0186"+
		"\3\2\2\2>\u0194\3\2\2\2@\u0196\3\2\2\2B\u01ae\3\2\2\2D\u01bb\3\2\2\2F"+
		"\u01c5\3\2\2\2H\u01d4\3\2\2\2J\u01e3\3\2\2\2L\u01f4\3\2\2\2N\u0202\3\2"+
		"\2\2P\u0204\3\2\2\2R\u0208\3\2\2\2T\u020b\3\2\2\2V\u0212\3\2\2\2X\u021a"+
		"\3\2\2\2Z\u021e\3\2\2\2\\\u0221\3\2\2\2^\u0224\3\2\2\2`\u0226\3\2\2\2"+
		"b\u0231\3\2\2\2d\u023c\3\2\2\2f\u0247\3\2\2\2h\u0252\3\2\2\2j\u025d\3"+
		"\2\2\2l\u026b\3\2\2\2n\u026d\3\2\2\2p\u0288\3\2\2\2rt\5\4\3\2sr\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2uw\5\b\5\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\n\6"+
		"\2yz\7\6\2\2z{\7\65\2\2{|\7\2\2\3|\3\3\2\2\2}~\7\3\2\2~\u0082\7,\2\2\177"+
		"\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\5\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a"+
		"\5\36\20\2\u0086\u008a\5 \21\2\u0087\u008a\5(\25\2\u0088\u008a\5\60\31"+
		"\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\7\4\2\2\u008c\u0090\7,\2\2\u008d"+
		"\u008f\5\f\7\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\t\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094"+
		"\7\5\2\2\u0094\u0099\7,\2\2\u0095\u0098\5\36\20\2\u0096\u0098\5\66\34"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\13\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\5\16\b\2\u009d\u009f\5\20\t\2\u009e\u009c\3\2\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5\32\16\2\u00a2"+
		"\u00a3\7<\2\2\u00a3\u00a5\7.\2\2\u00a4\u00a6\5\22\n\2\u00a5\u00a4\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8"+
		"\u00aa\7\60\2\2\u00a9\u00ab\5\26\f\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\5\66\34\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7\7\2\2\u00b4"+
		"\u00b5\7\65\2\2\u00b5\17\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\7<\2"+
		"\2\u00b8\u00ba\7.\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\u00bf\7\60\2\2\u00be"+
		"\u00c0\5\26\f\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3"+
		"\2\2\2\u00c1\u00c3\5\66\34\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\7\65\2\2\u00ca"+
		"\21\3\2\2\2\u00cb\u00d0\5\24\13\2\u00cc\u00cd\7\66\2\2\u00cd\u00cf\5\24"+
		"\13\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\23\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\b\2"+
		"\2\u00d4\u00d5\7<\2\2\u00d5\u00d6\7\64\2\2\u00d6\u00d7\5\32\16\2\u00d7"+
		"\25\3\2\2\2\u00d8\u00d9\7\3\2\2\u00d9\u00dd\7\62\2\2\u00da\u00dc\5\30"+
		"\r\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\63"+
		"\2\2\u00e1\27\3\2\2\2\u00e2\u00e7\5\36\20\2\u00e3\u00e7\5 \21\2\u00e4"+
		"\u00e7\5(\25\2\u00e5\u00e7\5\60\31\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\31\3\2\2\2\u00e8"+
		"\u00eb\5\34\17\2\u00e9\u00eb\7<\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ef"+
		"\7\b\2\2\u00ef\u00f0\7<\2\2\u00f0\u00f1\7\64\2\2\u00f1\u00f2\t\3\2\2\u00f2"+
		"\u00fd\7\65\2\2\u00f3\u00f4\7\b\2\2\u00f4\u00f5\7<\2\2\u00f5\u00f6\7\64"+
		"\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f9\5^\60\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\65\2\2\u00fb\u00fd\3"+
		"\2\2\2\u00fc\u00ee\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fd\37\3\2\2\2\u00fe"+
		"\u00ff\7\t\2\2\u00ff\u0100\7<\2\2\u0100\u0101\7\62\2\2\u0101\u0102\5^"+
		"\60\2\u0102\u0103\7\63\2\2\u0103\u0104\7\64\2\2\u0104\u0106\5\"\22\2\u0105"+
		"\u0107\5$\23\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0109\7\65\2\2\u0109\u0114\3\2\2\2\u010a\u010b\7\t\2\2\u010b"+
		"\u010c\7<\2\2\u010c\u010d\7\62\2\2\u010d\u010e\5^\60\2\u010e\u010f\7\63"+
		"\2\2\u010f\u0110\7\64\2\2\u0110\u0111\5$\23\2\u0111\u0112\7\65\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u00fe\3\2\2\2\u0113\u010a\3\2\2\2\u0114!\3\2\2\2"+
		"\u0115\u0118\5\34\17\2\u0116\u0118\7<\2\2\u0117\u0115\3\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118#\3\2\2\2\u0119\u011b\7\60\2\2\u011a\u011c\5&\24\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\61"+
		"\2\2\u011e%\3\2\2\2\u011f\u0124\5^\60\2\u0120\u0121\7\66\2\2\u0121\u0123"+
		"\5^\60\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\'\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\n\2\2"+
		"\u0128\u0129\7<\2\2\u0129\u012d\7\60\2\2\u012a\u012c\5*\26\2\u012b\u012a"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132\7"+
		"\7\2\2\u0132\u0133\7\65\2\2\u0133)\3\2\2\2\u0134\u0135\7\b\2\2\u0135\u0136"+
		"\7<\2\2\u0136\u0137\7\64\2\2\u0137\u0139\5.\30\2\u0138\u013a\5,\27\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0143\3\2\2\2\u013b\u013c\7\t"+
		"\2\2\u013c\u013d\7<\2\2\u013d\u013e\7\64\2\2\u013e\u0140\5.\30\2\u013f"+
		"\u0141\5,\27\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0134\3\2\2\2\u0142\u013b\3\2\2\2\u0143+\3\2\2\2\u0144\u0145"+
		"\t\4\2\2\u0145-\3\2\2\2\u0146\u014b\5\34\17\2\u0147\u014b\7\33\2\2\u0148"+
		"\u014b\7\34\2\2\u0149\u014b\7<\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b/\3\2\2\2\u014c\u014d"+
		"\7\b\2\2\u014d\u014e\7<\2\2\u014e\u014f\7\64\2\2\u014f\u0150\7<\2\2\u0150"+
		"\u0151\5\62\32\2\u0151\61\3\2\2\2\u0152\u0153\7\60\2\2\u0153\u0158\5\64"+
		"\33\2\u0154\u0155\7\66\2\2\u0155\u0157\5\64\33\2\u0156\u0154\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7\61\2\2\u015c\63\3\2\2\2\u015d\u015e"+
		"\7<\2\2\u015e\u015f\7\64\2\2\u015f\u0160\5^\60\2\u0160\65\3\2\2\2\u0161"+
		"\u016e\58\35\2\u0162\u016e\5<\37\2\u0163\u016e\5> \2\u0164\u016e\5@!\2"+
		"\u0165\u016e\5F$\2\u0166\u016e\5H%\2\u0167\u016e\5J&\2\u0168\u016e\5P"+
		")\2\u0169\u016e\5R*\2\u016a\u016e\5X-\2\u016b\u016e\5Z.\2\u016c\u016e"+
		"\5\\/\2\u016d\u0161\3\2\2\2\u016d\u0162\3\2\2\2\u016d\u0163\3\2\2\2\u016d"+
		"\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0166\3\2\2\2\u016d\u0167\3\2"+
		"\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\67\3\2\2\2\u016f\u0170\5:\36"+
		"\2\u0170\u0171\7-\2\2\u0171\u0172\5^\60\2\u0172\u0173\7\65\2\2\u0173\u0179"+
		"\3\2\2\2\u0174\u0175\5:\36\2\u0175\u0176\7-\2\2\u0176\u0177\5\62\32\2"+
		"\u0177\u0179\3\2\2\2\u0178\u016f\3\2\2\2\u0178\u0174\3\2\2\2\u01799\3"+
		"\2\2\2\u017a\u0183\7<\2\2\u017b\u017c\7\67\2\2\u017c\u0182\7<\2\2\u017d"+
		"\u017e\7\62\2\2\u017e\u017f\5^\60\2\u017f\u0180\7\63\2\2\u0180\u0182\3"+
		"\2\2\2\u0181\u017b\3\2\2\2\u0181\u017d\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184;\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0186\u0187\7&\2\2\u0187\u018c\5^\60\2\u0188\u0189\7&\2\2\u0189\u018b"+
		"\5^\60\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\65"+
		"\2\2\u0190=\3\2\2\2\u0191\u0195\7%\2\2\u0192\u0193\7<\2\2\u0193\u0195"+
		"\7%\2\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0195?\3\2\2\2\u0196\u0197"+
		"\7\16\2\2\u0197\u0198\7.\2\2\u0198\u0199\5^\60\2\u0199\u019a\7/\2\2\u019a"+
		"\u019e\7\60\2\2\u019b\u019d\5\66\34\2\u019c\u019b\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a5\7\61\2\2\u01a2\u01a4\5B\"\2\u01a3\u01a2\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\5D#\2\u01a9\u01a8\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\7\2\2\u01ac\u01ad"+
		"\7\65\2\2\u01adA\3\2\2\2\u01ae\u01af\7\17\2\2\u01af\u01b0\7.\2\2\u01b0"+
		"\u01b1\5^\60\2\u01b1\u01b2\7/\2\2\u01b2\u01b6\7\60\2\2\u01b3\u01b5\5\66"+
		"\34\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7\61"+
		"\2\2\u01baC\3\2\2\2\u01bb\u01bc\7\17\2\2\u01bc\u01c0\7\60\2\2\u01bd\u01bf"+
		"\5\66\34\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4"+
		"\7\61\2\2\u01c4E\3\2\2\2\u01c5\u01c6\7\20\2\2\u01c6\u01c7\7.\2\2\u01c7"+
		"\u01c8\5^\60\2\u01c8\u01c9\7/\2\2\u01c9\u01cd\7\60\2\2\u01ca\u01cc\5\66"+
		"\34\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7\61"+
		"\2\2\u01d1\u01d2\7\7\2\2\u01d2\u01d3\7\65\2\2\u01d3G\3\2\2\2\u01d4\u01d5"+
		"\7\21\2\2\u01d5\u01d9\7\60\2\2\u01d6\u01d8\5\66\34\2\u01d7\u01d6\3\2\2"+
		"\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01de\7\20\2\2"+
		"\u01de\u01df\7.\2\2\u01df\u01e0\5^\60\2\u01e0\u01e1\7/\2\2\u01e1\u01e2"+
		"\7\65\2\2\u01e2I\3\2\2\2\u01e3\u01e4\7\22\2\2\u01e4\u01e5\7.\2\2\u01e5"+
		"\u01e6\5L\'\2\u01e6\u01e7\7\65\2\2\u01e7\u01e8\5^\60\2\u01e8\u01e9\7\65"+
		"\2\2\u01e9\u01ea\5N(\2\u01ea\u01eb\7/\2\2\u01eb\u01ef\7\60\2\2\u01ec\u01ee"+
		"\5\66\34\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2"+
		"\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3"+
		"\7\61\2\2\u01f3K\3\2\2\2\u01f4\u01f5\7\b\2\2\u01f5\u01f6\7<\2\2\u01f6"+
		"\u01f7\7\64\2\2\u01f7\u01f9\5\32\16\2\u01f8\u01fa\5^\60\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faM\3\2\2\2\u01fb\u01fc\5:\36\2\u01fc"+
		"\u01fd\t\5\2\2\u01fd\u0203\3\2\2\2\u01fe\u01ff\5:\36\2\u01ff\u0200\7-"+
		"\2\2\u0200\u0201\5^\60\2\u0201\u0203\3\2\2\2\u0202\u01fb\3\2\2\2\u0202"+
		"\u01fe\3\2\2\2\u0203O\3\2\2\2\u0204\u0205\5:\36\2\u0205\u0206\t\5\2\2"+
		"\u0206\u0207\7\65\2\2\u0207Q\3\2\2\2\u0208\u0209\5T+\2\u0209\u020a\7\65"+
		"\2\2\u020aS\3\2\2\2\u020b\u020c\7<\2\2\u020c\u020e\7.\2\2\u020d\u020f"+
		"\5V,\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\7/\2\2\u0211U\3\2\2\2\u0212\u0217\5^\60\2\u0213\u0214\7\66\2\2"+
		"\u0214\u0216\5^\60\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218W\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021b\7\r\2\2\u021b\u021c\5^\60\2\u021c\u021d\7\65\2\2\u021dY\3\2\2\2"+
		"\u021e\u021f\7\24\2\2\u021f\u0220\7\65\2\2\u0220[\3\2\2\2\u0221\u0222"+
		"\7\23\2\2\u0222\u0223\7\65\2\2\u0223]\3\2\2\2\u0224\u0225\5`\61\2\u0225"+
		"_\3\2\2\2\u0226\u0227\b\61\1\2\u0227\u0228\5b\62\2\u0228\u022e\3\2\2\2"+
		"\u0229\u022a\f\4\2\2\u022a\u022b\7\"\2\2\u022b\u022d\5b\62\2\u022c\u0229"+
		"\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"a\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232\b\62\1\2\u0232\u0233\5d\63\2"+
		"\u0233\u0239\3\2\2\2\u0234\u0235\f\4\2\2\u0235\u0236\7!\2\2\u0236\u0238"+
		"\5d\63\2\u0237\u0234\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023ac\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\b\63\1\2"+
		"\u023d\u023e\5f\64\2\u023e\u0244\3\2\2\2\u023f\u0240\f\4\2\2\u0240\u0241"+
		"\t\6\2\2\u0241\u0243\5f\64\2\u0242\u023f\3\2\2\2\u0243\u0246\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245e\3\2\2\2\u0246\u0244\3\2\2\2"+
		"\u0247\u0248\b\64\1\2\u0248\u0249\5h\65\2\u0249\u024f\3\2\2\2\u024a\u024b"+
		"\f\4\2\2\u024b\u024c\t\7\2\2\u024c\u024e\5h\65\2\u024d\u024a\3\2\2\2\u024e"+
		"\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250g\3\2\2\2"+
		"\u0251\u024f\3\2\2\2\u0252\u0253\b\65\1\2\u0253\u0254\5j\66\2\u0254\u025a"+
		"\3\2\2\2\u0255\u0256\f\4\2\2\u0256\u0257\t\b\2\2\u0257\u0259\5j\66\2\u0258"+
		"\u0255\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025bi\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\b\66\1\2\u025e\u025f"+
		"\5l\67\2\u025f\u0265\3\2\2\2\u0260\u0261\f\4\2\2\u0261\u0262\t\t\2\2\u0262"+
		"\u0264\5l\67\2\u0263\u0260\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266k\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\t\n\2\2\u0269\u026c\5l\67\2\u026a\u026c\5n8\2\u026b\u0268\3\2\2\2\u026b"+
		"\u026a\3\2\2\2\u026cm\3\2\2\2\u026d\u0276\5p9\2\u026e\u026f\7\67\2\2\u026f"+
		"\u0275\7<\2\2\u0270\u0271\7\62\2\2\u0271\u0272\5^\60\2\u0272\u0273\7\63"+
		"\2\2\u0273\u0275\3\2\2\2\u0274\u026e\3\2\2\2\u0274\u0270\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u027b\t\5\2\2\u027a\u0279\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027bo\3\2\2\2\u027c\u0289\79\2\2\u027d\u0289\78\2\2\u027e"+
		"\u0289\7:\2\2\u027f\u0289\7;\2\2\u0280\u0289\7\33\2\2\u0281\u0289\7\34"+
		"\2\2\u0282\u0289\5T+\2\u0283\u0289\7<\2\2\u0284\u0285\7.\2\2\u0285\u0286"+
		"\5^\60\2\u0286\u0287\7/\2\2\u0287\u0289\3\2\2\2\u0288\u027c\3\2\2\2\u0288"+
		"\u027d\3\2\2\2\u0288\u027e\3\2\2\2\u0288\u027f\3\2\2\2\u0288\u0280\3\2"+
		"\2\2\u0288\u0281\3\2\2\2\u0288\u0282\3\2\2\2\u0288\u0283\3\2\2\2\u0288"+
		"\u0284\3\2\2\2\u0289q\3\2\2\2>sv\u0082\u0089\u0090\u0097\u0099\u009e\u00a5"+
		"\u00aa\u00af\u00ba\u00bf\u00c4\u00d0\u00dd\u00e6\u00ea\u00f8\u00fc\u0106"+
		"\u0113\u0117\u011b\u0124\u012d\u0139\u0140\u0142\u014a\u0158\u016d\u0178"+
		"\u0181\u0183\u018c\u0194\u019e\u01a5\u01a9\u01b6\u01c0\u01cd\u01d9\u01ef"+
		"\u01f9\u0202\u020e\u0217\u022e\u0239\u0244\u024f\u025a\u0265\u026b\u0274"+
		"\u0276\u027a\u0288";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}