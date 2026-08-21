package elmer.p1pigltin.core;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CodexErrorListener extends BaseErrorListener {
    private final ErrorReporter reporter;
    private final CompilerError.Fase fase;

    public CodexErrorListener(ErrorReporter reporter, CompilerError.Fase fase) {
        this.reporter = reporter;
        this.fase = fase;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String message,
                            RecognitionException exception) {
        reporter.report(new CompilerError(fase, message, line, charPositionInLine));
    }
}