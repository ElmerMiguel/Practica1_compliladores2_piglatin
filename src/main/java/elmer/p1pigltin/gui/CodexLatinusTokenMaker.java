package elmer.p1pigltin.gui;

import elmer.p1pigltin.antlr4.CodexLatinusLexer;
import org.antlr.v4.runtime.CharStreams;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;

import javax.swing.text.Segment;

public class CodexLatinusTokenMaker extends AbstractTokenMaker {
    public static final String SYNTAX_STYLE_CODEX_LATINUS = "text/codexlatinus";

    public static void register() {
        TokenMakerFactory factory = TokenMakerFactory.getDefaultInstance();
        if (factory instanceof AbstractTokenMakerFactory abstractFactory) {
            abstractFactory.putMapping(SYNTAX_STYLE_CODEX_LATINUS, CodexLatinusTokenMaker.class.getName());
        }
    }

    @Override
    public TokenMap getWordsToHighlight() {
        return new TokenMap();
    }

    @Override
    public Token getTokenList(Segment text, int initialTokenType, int startOffset) {
        resetTokenList();

        String line = new String(text.array, text.offset, text.count);
        CodexLatinusLexer lexer = new CodexLatinusLexer(CharStreams.fromString(line));

        org.antlr.v4.runtime.Token antlrToken = lexer.nextToken();
        while (antlrToken.getType() != org.antlr.v4.runtime.Token.EOF) {
            String tokenText = antlrToken.getText();
            if (tokenText != null && !tokenText.isEmpty()) {
                int tokenStart = antlrToken.getCharPositionInLine();
                int tokenEnd = tokenStart + tokenText.length() - 1;
                int mappedType = mapTokenType(antlrToken.getType());
                addToken(text.array,
                        text.offset + tokenStart,
                        text.offset + tokenEnd,
                        mappedType,
                        startOffset + tokenStart);
            }
            antlrToken = lexer.nextToken();
        }

        addNullToken();
        return firstToken;
    }

    private int mapTokenType(int tokenType) {
        if (tokenType == CodexLatinusLexer.IDENT) {
            return Token.IDENTIFIER;
        }
        if (tokenType == CodexLatinusLexer.DECIMAL_LIT || tokenType == CodexLatinusLexer.NUMERUS_LIT) {
            return Token.LITERAL_NUMBER_DECIMAL_INT;
        }
        if (tokenType == CodexLatinusLexer.TEXTUM_LIT) {
            return Token.LITERAL_STRING_DOUBLE_QUOTE;
        }
        if (tokenType == CodexLatinusLexer.LITTERA_LIT) {
            return Token.LITERAL_CHAR;
        }
        if (tokenType == CodexLatinusLexer.VERUM || tokenType == CodexLatinusLexer.FALSUS) {
            return Token.RESERVED_WORD_2;
        }
        if (tokenType == CodexLatinusLexer.LINE_COMMENT || tokenType == CodexLatinusLexer.BLOCK_COMMENT) {
            return Token.COMMENT_EOL;
        }
        if (tokenType == CodexLatinusLexer.WS) {
            return Token.WHITESPACE;
        }
        if (isOperator(tokenType)) {
            return Token.OPERATOR;
        }
        if (isSeparator(tokenType)) {
            return Token.SEPARATOR;
        }
        if (isReservedWord(tokenType)) {
            return Token.RESERVED_WORD;
        }
        return Token.IDENTIFIER;
    }

    private boolean isOperator(int tokenType) {
        return tokenType == CodexLatinusLexer.EQ
                || tokenType == CodexLatinusLexer.NEQ
                || tokenType == CodexLatinusLexer.LE
                || tokenType == CodexLatinusLexer.GE
                || tokenType == CodexLatinusLexer.AND
                || tokenType == CodexLatinusLexer.OR
                || tokenType == CodexLatinusLexer.INC
                || tokenType == CodexLatinusLexer.DEC
                || tokenType == CodexLatinusLexer.PLUS
                || tokenType == CodexLatinusLexer.MINUS
                || tokenType == CodexLatinusLexer.STAR
                || tokenType == CodexLatinusLexer.SLASH
                || tokenType == CodexLatinusLexer.LT
                || tokenType == CodexLatinusLexer.GT
                || tokenType == CodexLatinusLexer.ASSIGN
                || tokenType == CodexLatinusLexer.NOT
                || tokenType == CodexLatinusLexer.READ
                || tokenType == CodexLatinusLexer.PRINT;
    }

    private boolean isSeparator(int tokenType) {
        return tokenType == CodexLatinusLexer.LPAREN
                || tokenType == CodexLatinusLexer.RPAREN
                || tokenType == CodexLatinusLexer.LBRACE
                || tokenType == CodexLatinusLexer.RBRACE
                || tokenType == CodexLatinusLexer.LBRACK
                || tokenType == CodexLatinusLexer.RBRACK
                || tokenType == CodexLatinusLexer.COLON
                || tokenType == CodexLatinusLexer.SEMI
                || tokenType == CodexLatinusLexer.COMMA
                || tokenType == CodexLatinusLexer.DOT;
    }

    private boolean isReservedWord(int tokenType) {
        return tokenType == CodexLatinusLexer.SEC_VARIABILES
                || tokenType == CodexLatinusLexer.SEC_MUNERA
                || tokenType == CodexLatinusLexer.SEC_MAIOR
                || tokenType == CodexLatinusLexer.FIN_PROGRAMA
                || tokenType == CodexLatinusLexer.FIN_BLOQUE
                || tokenType == CodexLatinusLexer.KW_ESTO
                || tokenType == CodexLatinusLexer.KW_SERIES
                || tokenType == CodexLatinusLexer.KW_STRUCTURA
                || tokenType == CodexLatinusLexer.KW_RATIO
                || tokenType == CodexLatinusLexer.KW_ACTIO
                || tokenType == CodexLatinusLexer.KW_REDDERE
                || tokenType == CodexLatinusLexer.KW_SI
                || tokenType == CodexLatinusLexer.KW_ALITER
                || tokenType == CodexLatinusLexer.KW_DUM
                || tokenType == CodexLatinusLexer.KW_FACERE
                || tokenType == CodexLatinusLexer.KW_PER
                || tokenType == CodexLatinusLexer.KW_PERGE
                || tokenType == CodexLatinusLexer.KW_INTERRUMPE
                || tokenType == CodexLatinusLexer.KW_NUMERUS
                || tokenType == CodexLatinusLexer.KW_TEXTUM
                || tokenType == CodexLatinusLexer.KW_DECIMALIS
                || tokenType == CodexLatinusLexer.KW_LITTERA
                || tokenType == CodexLatinusLexer.KW_BOOL
                || tokenType == CodexLatinusLexer.VERUM
                || tokenType == CodexLatinusLexer.FALSUS;
    }
}