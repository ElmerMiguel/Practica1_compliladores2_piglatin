package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilerError;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;

public final class FixtureRunner {
    private static final Map<String, Boolean> EXPECTED = Map.of(
            "input1.lat", true,
            "input2.lat", true,
            "declaracion_sin_igual.lat", true,
            "struct_campos_desordenados.lat", true,
            "condicion_no_booleana.lat", false,
            "array_fuera_rango.lat", false,
            "array_indice_constante_valido.lat", true,
            "inicializacion_incompleta.lat", false
    );

    private FixtureRunner() { }

    public static void main(String[] args) throws Exception {
        CompilationPipeline pipeline = new CompilationPipeline();
        int passed = 0;
        try (var files = Files.list(Path.of("tests"))) {
            for (Path file : files.filter(path -> path.toString().endsWith(".lat"))
                    .sorted(Comparator.comparing(Path::toString)).toList()) {
                if (runCase(pipeline, file, EXPECTED.getOrDefault(file.getFileName().toString(), false))) {
                    passed++;
                }
            }
        }
        int total = EXPECTED.size();
        System.out.printf("Fixtures: %d/%d PASS%n", passed, total);
        if (passed != total) {
            throw new AssertionError("Fallaron fixtures de parser/semantica");
        }
        runCase(pipeline, Path.of("docs/Prueba.lat"), true);
        runCase(pipeline, Path.of("docs/correcta1.txt"), true);
    }

    private static boolean runCase(CompilationPipeline pipeline, Path file, boolean expected)
            throws Exception {
        CompilationPipeline.CompilationResult result = pipeline.compile(
                Files.readString(file, StandardCharsets.UTF_8));
        boolean valid = !result.errores().tieneErrores();
        boolean pass = valid == expected;
        System.out.printf("%s - %s (esperado %s)%n", pass ? "PASS" : "FAIL",
                file, valid ? "OK" : "ERROR");
        for (CompilerError error : result.errores().errores()) {
            System.out.printf("  %s %d:%d - %s%n", error.fase(), error.linea(),
                    error.columna(), error.mensaje());
        }
        return pass;
    }
}
