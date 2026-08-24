package elmer.p1pigltin.gui;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class EditorPanel extends JPanel {
    private final RSyntaxTextArea editor;

    public EditorPanel() {
        super(new BorderLayout());
        CodexLatinusTokenMaker.register();
        editor = new RSyntaxTextArea(30, 80);
        editor.setSyntaxEditingStyle(CodexLatinusTokenMaker.SYNTAX_STYLE_CODEX_LATINUS);
        editor.setCodeFoldingEnabled(false);
        editor.setAntiAliasingEnabled(true);
        MonokaiSyntaxTheme.apply(editor);
        add(new RTextScrollPane(editor), BorderLayout.CENTER);
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