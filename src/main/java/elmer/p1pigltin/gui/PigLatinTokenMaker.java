package elmer.p1pigltin.gui;

import elmer.p1pigltin.translator.PigLatinTranslator.PigLatinWordRules;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

import javax.swing.text.Segment;
import java.util.Set;

public class PigLatinTokenMaker extends AbstractTokenMaker {
    public static final String SYNTAX_STYLE_PIG_LATIN = "text/piglatin";

    private static final Set<String> KEYWORDS = Set.of(
            pig("VARIABILES"), pig("MUNERA"), pig("MAIOR"), pig("FINIS"), pig("finis"),
            pig("esto"), pig("series"), pig("structura"), pig("ratio"), pig("actio"),
            pig("reddere"), pig("si"), pig("aliter"), pig("dum"), pig("facere"),
            pig("per"), pig("perge"), pig("interrumpe"), pig("numerus"), pig("textum"),
            pig("decimalis"), pig("littera"), pig("bool"), pig("verum"), pig("falsus"),
            pig("non"));
    private static final Set<String> BOOLEAN_KEYWORDS = Set.of(
            pig("verum"), pig("falsus"));

    private static String pig(String word) {
        return PigLatinWordRules.toPigLatin(word);
    }

    public static void register() {
        if (TokenMakerFactoryHolder.FACTORY instanceof org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory factory) {
            factory.putMapping(SYNTAX_STYLE_PIG_LATIN, PigLatinTokenMaker.class.getName());
        }
    }

    @Override
    public TokenMap getWordsToHighlight() {
        return new TokenMap();
    }

    @Override
    public Token getTokenList(Segment text, int initialTokenType, int startOffset) {
        resetTokenList();
        int index = text.offset;
        int end = text.offset + text.count;
        while (index < end) {
            char current = text.array[index];
            if (Character.isWhitespace(current)) {
                int start = index++;
                while (index < end && Character.isWhitespace(text.array[index])) index++;
                addToken(text.array, start, index - 1, Token.WHITESPACE, startOffset + start - text.offset);
            } else if (current == '/' && index + 1 < end && text.array[index + 1] == '/') {
                addToken(text.array, index, end - 1, Token.COMMENT_EOL, startOffset + index - text.offset);
                break;
            } else if (current == '"' || current == '\'') {
                int start = index++;
                while (index < end) {
                    if (text.array[index] == '\\' && index + 1 < end) index += 2;
                    else if (text.array[index++] == current) break;
                }
                addToken(text.array, start, Math.min(index, end) - 1,
                        current == '"' ? Token.LITERAL_STRING_DOUBLE_QUOTE : Token.LITERAL_CHAR,
                        startOffset + start - text.offset);
            } else if (Character.isDigit(current)) {
                int start = index++;
                while (index < end && (Character.isDigit(text.array[index]) || text.array[index] == '.')) index++;
                addToken(text.array, start, index - 1, Token.LITERAL_NUMBER_DECIMAL_INT,
                        startOffset + start - text.offset);
            } else if (Character.isLetter(current) || current == '_') {
                int start = index++;
                while (index < end && (Character.isLetterOrDigit(text.array[index]) || text.array[index] == '_')) index++;
                String word = new String(text.array, start, index - start);
                int tokenType = BOOLEAN_KEYWORDS.contains(word) ? Token.RESERVED_WORD_2
                    : KEYWORDS.contains(word) ? Token.RESERVED_WORD : Token.IDENTIFIER;
                addToken(text.array, start, index - 1, tokenType,
                        startOffset + start - text.offset);
            } else {
                int start = index++;
                int type = current == '%' || "+-*/=<>!&|".indexOf(current) >= 0
                        ? Token.OPERATOR : Token.SEPARATOR;
                if ((current == '%' || current == '&' || current == '|') && index < end) {
                    while (index < end && Character.isLetter(text.array[index])) index++;
                } else if (index < end && (text.array[index] == '=' || text.array[index] == current)) {
                    index++;
                }
                addToken(text.array, start, index - 1, type, startOffset + start - text.offset);
            }
        }
        addNullToken();
        return firstToken;
    }

    private static final class TokenMakerFactoryHolder {
        private static final org.fife.ui.rsyntaxtextarea.TokenMakerFactory FACTORY =
                org.fife.ui.rsyntaxtextarea.TokenMakerFactory.getDefaultInstance();
    }
}
