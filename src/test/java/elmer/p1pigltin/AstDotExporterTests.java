package elmer.p1pigltin;

import elmer.p1pigltin.ast.AstDotExporter;
import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;
import elmer.p1pigltin.core.DotRenderer;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class AstDotExporterTests {
    public static void main(String[] args) throws Exception {
        CompilationResult result = new CompilationPipeline().compile("""
                VARIABILES>
                esto edad : numerus 20;
                esto cifrado : falsus;
                esto comandante : textum "Estudiante X";
                esto fuerza : numerus 10;
                esto poder : numerus 0;
                MUNERA>
                ratio numerus calcularPoder(esto fuerza : numerus) {
                    VARIABILES[
                        esto total : numerus fuerza * 2;
                    ]
                    reddere total;
                } finis;
                MAIOR>
                >> "Hola comandante!";
                comandante <<
                edad <<
                si (edad >= 18) {
                    cifrado = verum;
                    fuerza = 12;
                } finis;
                >> "Tu poder es: " >> calcularPoder(fuerza);
                FINIS;
                """);

        if (result.errores().tieneErrores()) {
            throw new IllegalStateException("El ejemplo completo produjo errores: "
                    + result.errores().errores());
        }
        String dot = AstDotExporter.exportar(result.ast());
        Path outputDirectory = Path.of("target");
        Path dotPath = outputDirectory.resolve("ast-complete.dot");
        Path pngPath = outputDirectory.resolve("ast-complete.png");
        Files.createDirectories(outputDirectory);
        Files.writeString(dotPath, dot, StandardCharsets.UTF_8);
        Optional<Path> rendered = DotRenderer.renderizarPng(dot, pngPath);

        System.out.println("DOT: " + dotPath.toAbsolutePath());
        System.out.println(rendered.isPresent()
                ? "Graphviz disponible: PNG generado en " + rendered.get().toAbsolutePath()
                : "Graphviz no disponible: se conserva el archivo DOT");
        System.out.println("Nodos DOT: " + dot.lines().filter(line -> line.contains(" [label=\"")).count());
    }
}