
package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;

public class P1Pigltin {

    public static void main(String[] args) {
        String validSource = """
                VARIABILES>
                MUNERA>
                ratio numerus calcularPoder(esto fuerza : numerus, esto precision : decimalis) {
                    VARIABILES[
                        esto total : numerus fuerza * 2;
                    ]
                    reddere total;
                } finis;
                MAIOR>
                esto edad : numerus 20;
                esto fuerza : numerus 10;
                esto poder : numerus calcularPoder(fuerza, 0.5);
                si (edad >= 18) {
                    fuerza = fuerza + 2;
                } aliter {
                    fuerza = 0;
                } finis;
                dum (fuerza < 20) {
                    fuerza++;
                } finis;
                >> poder;
                FINIS;
                """;

        String invalidReturn = """
                VARIABILES>
                MUNERA>
                ratio numerus calcularPoder() {
                    reddere 3.4;
                } finis;
                MAIOR>
                FINIS;
                """;

        String invalidUnreachable = """
                VARIABILES>
                MUNERA>
                ratio numerus calcularPoder() {
                    reddere 1;
                    >> "no debe ejecutarse";
                } finis;
                MAIOR>
                FINIS;
                """;

        String invalidMissingReturn = """
                VARIABILES>
                MUNERA>
                ratio numerus calcularPoder(esto edad : numerus) {
                    si (edad >= 18) {
                        reddere 1;
                    } aliter {
                        >> "sin retorno";
                    } finis;
                } finis;
                MAIOR>
                FINIS;
                """;

        CompilationPipeline pipeline = new CompilationPipeline();
        printResult("CASO VALIDO", pipeline.compile(validSource));
        printResult("RETORNO INVALIDO", pipeline.compile(invalidReturn));
        printResult("CODIGO INALCANZABLE", pipeline.compile(invalidUnreachable));
        printResult("RETORNO INCOMPLETO", pipeline.compile(invalidMissingReturn));
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
