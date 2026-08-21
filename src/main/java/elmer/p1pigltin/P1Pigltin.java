
package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;

public class P1Pigltin {

    public static void main(String[] args) {
        String validSource = """
                VARIABILES>
                
                MUNERA>
                
                MAIOR>
                esto resultado : numerus 1 + 3;
                >> resultado;
                FINIS;
                """;

        String invalidSource = """
                VARIABILES>
                MUNERA>
                MAIOR>
                esto x : numerus "hola";
                FINIS;
                """;

        CompilationPipeline pipeline = new CompilationPipeline();
        printResult("CASO VALIDO", pipeline.compile(validSource));
        printResult("CASO INVALIDO", pipeline.compile(invalidSource));
    }

    private static void printResult(String title, CompilationResult result) {
        System.out.println(title);
        System.out.println(result.prettyPrint());
        if (!result.errores().tieneErrores()) {
            System.out.println("PigLatin:");
            System.out.println(result.pigLatin());
        }
    }
}
