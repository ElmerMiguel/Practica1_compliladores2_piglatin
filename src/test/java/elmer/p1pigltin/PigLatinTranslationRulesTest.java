package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;

public final class PigLatinTranslationRulesTest {
    private PigLatinTranslationRulesTest() { }

    public static void main(String[] args) {
        CompilationPipeline.CompilationResult result = new CompilationPipeline().compile("""
                VARIABILES>
                esto x : numerus 1;
                esto y : numerus 2;
                esto activo : verum;
                series lista[3] : numerus {1, 2, 3};
                structura Dato {
                    esto valor : numerus;
                } finis;
                esto objeto : Dato { valor: 7 }
                MUNERA>
                ratio numerus sumar(esto izquierda : numerus, esto derecha : numerus) {
                    reddere izquierda + derecha;
                } finis;
                MAIOR>
                >> x >> y;
                x <<;
                si ((x < y && non activo) || x == y) {
                    x = sumar(x, y);
                } finis;
                >> objeto.valor >> lista[x];
                FINIS;
                """);
        if (result.errores().tieneErrores()) {
            throw new AssertionError(result.errores().errores());
        }
        String output = result.pigLatin();
        require(output, "%OINK xay %OINK yay;", "print conserva cada operador >>");
        require(output, "%OINK_OINK xay;", "read usa %OINK_OINK como prefijo");
        require(output, "((xay < yay && non activoway) || xay == yay)",
                "operadores y parentesis se conservan");
        require(output, "umarsay(xay, yay)", "nombre de funcion y argumentos se recorren");
        require(output, "objetoway.alorvay %OINK istalay[xay]", "accesos de struct y array se recorren");
        require(output, "estoway activoway : erumvay;", "booleano corto no duplica su valor");
        if (output.contains("erumvay erumvay")) {
            throw new AssertionError("Se duplico un valor booleano: " + output);
        }
        System.out.println("PigLatinTranslationRulesTest: PASS");
        System.out.println(output);
    }

    private static void require(String output, String expected, String description) {
        if (!output.contains(expected)) {
            throw new AssertionError(description + ". Esperado: " + expected + "\nObtenido:\n" + output);
        }
    }
}
