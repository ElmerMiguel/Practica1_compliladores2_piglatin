package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;

public final class BooleanGrammarCheck {
    private BooleanGrammarCheck() { }

    public static void main(String[] args) {
        CompilationPipeline.CompilationResult result = new CompilationPipeline().compile("""
                VARIABILES>
                series interruptores[3] : verum {verum, falsus, verum};
                series estados[3] : {verum, falsus, verum};
                MUNERA>
                ratio verum esPositivo(esto numero : numerus) {
                    reddere verum;
                } finis;
                MAIOR>
                FINIS;
                """);
        if (result.errores().tieneErrores()) {
            throw new AssertionError(result.errores().errores().toString());
        }
        String output = result.pigLatin();
        if (output == null || !output.contains("erumvay") || output.contains("oolbay")) {
            throw new AssertionError("Salida booleana inesperada: " + output);
        }
        System.out.println("BooleanGrammarCheck: PASS");
        System.out.println(output);
    }
}
