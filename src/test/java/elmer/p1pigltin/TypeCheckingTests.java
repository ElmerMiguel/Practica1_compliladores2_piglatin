package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;

public class TypeCheckingTests {
    private static final CompilationPipeline PIPELINE = new CompilationPipeline();
    private static int total;
    private static int passed;

    public static void main(String[] args) {
        check("1a declaracion ascendente valida", program("esto x : decimalis 1;"), false);
        check("1b declaracion incompatible", program("esto x : numerus \"hola\";"), true);

        check("2a asignacion ascendente valida", program("esto x : decimalis 0; x = 1;"), false);
        check("2b asignacion incompatible", program("esto x : numerus 0; x = 1.5;"), true);

        check("3a llamada valida", functionProgram("esto y : numerus f(1);", "ratio numerus f(esto x : numerus) { reddere x; }"), false);
        check("3b llamada con cantidad incorrecta", functionProgram("esto y : numerus f();", "ratio numerus f(esto x : numerus) { reddere x; }"), true);
        check("3c llamada con tipo incorrecto", functionProgram("esto y : numerus f(\"hola\");", "ratio numerus f(esto x : numerus) { reddere x; }"), true);

        check("4a logico valido", program("esto a : bool verum; esto b : bool falsus; esto c : bool a && b;"), false);
        check("4b logico corrupcion de flujo", program("esto c : bool 1 && verum;"), true);

        check("5a condicion booleana valida", program("esto b : bool verum; si (b) { } finis;"), false);
        check("5b condicion numerica invalida", program("si (1) { } finis;"), true);

        check("6a non booleano valido", program("esto b : bool non verum;"), false);
        check("6b non numerico invalido", program("esto b : bool non 1;"), true);

        check("7a minus numerico valido", program("esto x : numerus -1;"), false);
        check("7b minus textum invalido", program("esto x : textum -\"hola\";"), true);

        check("8a concatenacion textum-littera valida", program("esto x : textum \"hola\" + 'a';"), false);
        check("8b multiplicacion textum-numerus invalida", program("esto x : textum \"hola\" * 2;"), true);

        System.out.println("\nResultado: " + passed + "/" + total + " PASS");
        if (passed != total) throw new AssertionError("Fallaron pruebas de type checking");
    }

    private static void check(String name, String source, boolean expectsErrors) {
        total++;
        CompilationResult result = PIPELINE.compile(source);
        boolean hasErrors = result.errores().tieneErrores();
        boolean ok = hasErrors == expectsErrors;
        if (ok) passed++;
        System.out.println((ok ? "PASS" : "FAIL") + " - " + name
                + " | errores=" + hasErrors);
        if (!ok) result.errores().errores().forEach(error -> System.out.println("  " + error));
    }

    private static String program(String body) {
        return "VARIABILES>\nMUNERA>\nMAIOR>\n" + body + "\nFINIS;\n";
    }

    private static String functionProgram(String body, String function) {
        return "VARIABILES>\nMUNERA>\n" + function + " finis;\nMAIOR>\n" + body + "\nFINIS;\n";
    }
}
