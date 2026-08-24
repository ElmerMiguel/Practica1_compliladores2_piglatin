package elmer.p1pigltin.gui;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Color;

public class EditorPanel extends JPanel {
    private final RSyntaxTextArea editor;

    public EditorPanel() {
        super(new BorderLayout());
        editor = new RSyntaxTextArea(30, 80);
        editor.setSyntaxEditingStyle(CodexLatinusTokenMaker.SYNTAX_STYLE_CODEX_LATINUS);
        editor.setCodeFoldingEnabled(false);
        editor.setAntiAliasingEnabled(true);
        applyLookAndFeelColors();
        add(new RTextScrollPane(editor), BorderLayout.CENTER);
    }

    private void applyLookAndFeelColors() {
        Color background = UIManager.getColor("TextArea.background");
        Color foreground = UIManager.getColor("TextArea.foreground");
        Color selection = UIManager.getColor("TextArea.selectionBackground");
        Color selectionText = UIManager.getColor("TextArea.selectionForeground");
        if (background != null) editor.setBackground(background);
        if (foreground != null) editor.setForeground(Color.WHITE);
        if (selection != null) editor.setSelectionColor(selection);
        if (selectionText != null) editor.setSelectedTextColor(selectionText);
        editor.setCaretColor(foreground);
    }

    public RSyntaxTextArea textArea() {
        return editor;
    }

    public String getCode() {
        return editor.getText();
    }

    public void setCode(String code) {
        editor.setText(code == null ? "" : code);
        editor.setCaretPosition(0);
    }

    public void goTo(int line, int column) {
        if (line <= 0) {
            return;
        }
        try {
            int offset = editor.getLineStartOffset(line - 1) + Math.max(0, column - 1);
            offset = Math.min(offset, editor.getDocument().getLength());
            editor.requestFocusInWindow();
            editor.setCaretPosition(offset);
        } catch (Exception ignored) {

        }
    }
}