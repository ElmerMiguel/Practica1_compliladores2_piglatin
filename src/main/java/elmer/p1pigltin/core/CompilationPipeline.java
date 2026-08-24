package elmer.p1pigltin.core;

import elmer.p1pigltin.ast.AstBuilder;
import elmer.p1pigltin.ast.AstNode;
import elmer.p1pigltin.antlr4.CodexLatinusLexer;
import elmer.p1pigltin.antlr4.CodexLatinusParser;
import elmer.p1pigltin.semantic.SemanticAnalyzer;
import elmer.p1pigltin.semantic.SymbolTable;
import elmer.p1pigltin.translator.PigLatinTranslator;
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

        ParseStackRecorder stackRecorder = new ParseStackRecorder();
        parser.addParseListener(stackRecorder);
        CodexLatinusParser.ProgramContext program = parser.program();
        AstNode ast = reporter.tieneErrores() ? null : new AstBuilder().visit(program);
        SymbolTable tabla = new SymbolTable();
        String pigLatin = null;

        if (!reporter.tieneErrores()) {
            SemanticAnalyzer semantic = new SemanticAnalyzer(tabla, reporter);
            semantic.declararSimbolos(ast);
            semantic.verificarTipos(ast);
            if (!reporter.tieneErrores()) {
                pigLatin = new PigLatinTranslator().traducir(ast);
            }
        }
        return new CompilationResult(ast, tabla, reporter, pigLatin, stackRecorder.snapshots());
    }

    public static final class CompilationResult {
        private final AstNode ast;
        private final SymbolTable tabla;
        private final ErrorReporter errores;
        private final String pigLatin;
        private final java.util.List<ParseStackRecorder.ParseStackSnapshot> pila;

        public CompilationResult(AstNode ast, SymbolTable tabla, ErrorReporter errores, String pigLatin,
                     java.util.List<ParseStackRecorder.ParseStackSnapshot> pila) {
            this.ast = ast;
            this.tabla = tabla;
            this.errores = errores;
            this.pigLatin = pigLatin;
            this.pila = java.util.List.copyOf(pila);
        }

        public AstNode ast() {
            return ast;
        }

        public ErrorReporter errores() {
            return errores;
        }

        public SymbolTable tabla() {
            return tabla;
        }

        public String pigLatin() {
            return pigLatin;
        }

        public java.util.List<ParseStackRecorder.ParseStackSnapshot> pila() {
            return pila;
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