package elmer.p1pigltin.gui;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.Style;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Token;

import javax.swing.UIManager;
import java.awt.Color;

public final class MonokaiSyntaxTheme {
    private static final Color BACKGROUND = new Color(39, 40, 34);
    private static final Color FOREGROUND = Color.WHITE;
    private static final Color OPERATOR = new Color(249, 38, 114);
    private static final Color KEYWORD = new Color(102, 217, 239);
    private static final Color BOOLEAN = new Color(166, 226, 46);
    private static final Color SEPARATOR = new Color(230, 219, 116);
    private static final Color COMMENT = new Color(117, 113, 94);
    private static final Color LITERAL = new Color(255, 140, 0);

    private MonokaiSyntaxTheme() {
    }

    public static void apply(RSyntaxTextArea textArea) {
        SyntaxScheme scheme = new SyntaxScheme(true);
        set(scheme, Token.IDENTIFIER, FOREGROUND);
        set(scheme, Token.RESERVED_WORD, KEYWORD);
        set(scheme, Token.RESERVED_WORD_2, BOOLEAN);
        set(scheme, Token.OPERATOR, OPERATOR);
        set(scheme, Token.SEPARATOR, SEPARATOR);
        set(scheme, Token.COMMENT_EOL, COMMENT);
        set(scheme, Token.COMMENT_DOCUMENTATION, COMMENT);
        set(scheme, Token.COMMENT_MULTILINE, COMMENT);
        set(scheme, Token.LITERAL_NUMBER_DECIMAL_INT, LITERAL);
        set(scheme, Token.LITERAL_NUMBER_FLOAT, LITERAL);
        set(scheme, Token.LITERAL_STRING_DOUBLE_QUOTE, LITERAL);
        set(scheme, Token.LITERAL_CHAR, LITERAL);
        set(scheme, Token.LITERAL_BOOLEAN, BOOLEAN);
        textArea.setSyntaxScheme(scheme);
        textArea.setBackground(BACKGROUND);
        textArea.setForeground(FOREGROUND);
        textArea.setCaretColor(FOREGROUND);
        textArea.setSelectionColor(new Color(73, 72, 62));
        textArea.setSelectedTextColor(FOREGROUND);
        textArea.setCurrentLineHighlightColor(new Color(49, 50, 43));
        textArea.setHighlightCurrentLine(true);
        textArea.setLineWrap(false);
        textArea.setOpaque(true);
        textArea.setFont(UIManager.getFont("TextArea.font"));
    }

    private static void set(SyntaxScheme scheme, int tokenType, Color color) {
        scheme.setStyle(tokenType, new Style(color));
    }
}
