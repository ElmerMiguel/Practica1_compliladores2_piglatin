package elmer.p1pigltin.core;

import elmer.p1pigltin.ast.AstBuilder;
import elmer.p1pigltin.ast.AstNode;
import elmer.p1pigltin.antlr4.CodexLatinusLexer;
import elmer.p1pigltin.antlr4.CodexLatinusParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class CompilationPipeline {
    public CompilationResult compile(String source) {
        ErrorReporter reporter = new ErrorReporter();

        CodexLatinusLexer lexer = new CodexLatinusLexer(CharStreams.fromString(source));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new CodexErrorListener(reporter, CompilerError.Fase.LEXICA));

        CodexLatinusParser parser = new CodexLatinusParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new CodexErrorListener(reporter, CompilerError.Fase.SINTACTICA));

        AstNode ast = new AstBuilder().visit(parser.program());
        return new CompilationResult(ast, reporter);
    }

    public static final class CompilationResult {
        private final AstNode ast;
        private final ErrorReporter errores;

        public CompilationResult(AstNode ast, ErrorReporter errores) {
            this.ast = ast;
            this.errores = errores;
        }

        public AstNode ast() {
            return ast;
        }

        public ErrorReporter errores() {
            return errores;
        }

        public String prettyPrint() {
            StringBuilder output = new StringBuilder();
            prettyPrint(ast, output, 0);
            if (errores.tieneErrores()) {
                output.append("\nErrores:\n");
                errores.errores().forEach(error -> output.append(error).append('\n'));
            }
            return output.toString();
        }

        private void prettyPrint(AstNode node, StringBuilder output, int depth) {
            if (node == null) {
                return;
            }
            output.append("  ".repeat(depth))
                    .append(node.tipo)
                    .append(node.attrs)
                    .append('\n');
            for (AstNode child : node.children) {
                prettyPrint(child, output, depth + 1);
            }
        }
    }
}