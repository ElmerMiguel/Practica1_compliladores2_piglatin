package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;
import elmer.p1pigltin.core.CompilerError;

import java.util.ArrayList;
import java.util.List;

public final class RegressionTest {
    private static final CompilationPipeline PIPELINE = new CompilationPipeline();
    private static final List<String> failures = new ArrayList<>();
    private static int total;
    private static int passed;

    private RegressionTest() { }

    public static void main(String[] args) {
        validCases();
        invalidCases();
        System.out.println("\nResumen de regresion: " + passed + "/" + total + " PASS");
        if (!failures.isEmpty()) {
            System.out.println("Fallos:");
            failures.forEach(System.out::println);
            throw new AssertionError("Fallaron " + failures.size() + " pruebas de regresion");
        }
    }

    private static void validCases() {
        checkValid("1 ejemplo completo", """
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
                >> "Ingresa tu nombre por favor";
                comandante <<
                >> "Bienvenido" >> comandante;
                >> "Ingresa tu edad";
                edad <<
                si (edad >= 18) {
                    cifrado = verum;
                    fuerza = 12;
                } aliter {
                    fuerza = 0;
                } finis;
                >> "Tu poder es: " >> calcularPoder(fuerza);
                >> "La puerta esta cifrada?" >> cifrado;
                FINIS;
                """);

        checkValid("2 Persona", """
                VARIABILES>
                structura Persona {
                    esto nombre: textum;
                    esto edad: numerus;
                } finis;
                esto mi_personaje : Persona {
                    nombre: "Yennifer",
                    edad: 999
                }
                MUNERA>
                MAIOR>
                >> mi_personaje.nombre;
                FINIS;
                """);

        checkValid("3 Animal Selva anidado", """
                VARIABILES>
                structura Animal {
                    esto nombre: textum,
                    esto apodo: textum
                } finis;
                structura Selva {
                    esto valido : verum,
                    series animales : Animal
                } finis;
                esto mi_selva: Selva {
                    valido: verum,
                    animales: Animal[7]
                }
                MUNERA>
                MAIOR>
                mi_selva.animales[1] = {
                    nombre: "Perro",
                    apodo: "Canis"
                }
                >> mi_selva.animales[1].nombre;
                FINIS;
                """);

        checkValid("4 arreglos y bool especial", """
                VARIABILES>
                series mis_enteros[2] : numerus {1, 1};
                series nombres[2] : textum {"Hola", "Adios"};
                series flags[2] : {verum, falsus};
                MUNERA>
                MAIOR>
                >> mis_enteros[0] >> nombres[1] >> flags[0];
                FINIS;
                """);

        checkValid("5 tres ciclos", """
                VARIABILES>
                esto x : numerus 0;
                MUNERA>
                MAIOR>
                dum (x < 10) {
                    x = x + 1;
                    perge;
                } finis;
                facere {
                    x++;
                    interrumpe;
                } dum (x < 10);
                per (esto i : numerus 0; i < 10; i++) {
                    perge;
                }
                FINIS;
                """);

        checkValid("6 funcion actio", """
                VARIABILES>
                MUNERA>
                actio saludar(esto veces : numerus) {
                    >> "Hola";
                } finis;
                MAIOR>
                saludar(1);
                FINIS;
                """);
    }

    private static void invalidCases() {
        checkInvalid("7a retorno incorrecto", "DECIMALIS", """
                VARIABILES>
                MUNERA>
                ratio numerus calcularPoder() {
                    reddere 3.4;
                } finis;
                MAIOR>
                FINIS;
                """);

        checkInvalid("7b codigo inalcanzable", "Codigo no alcanzable", """
                VARIABILES>
                MUNERA>
                ratio numerus calcularPoder() {
                    reddere 1;
                    >> "no debe ejecutarse";
                } finis;
                MAIOR>
                FINIS;
                """);

        checkInvalid("7c retorno incompleto", "no retorna", """
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
                """);

        checkInvalid("8 condicion numerica", "Corrupcion de Flujo", program("si (1) { } finis;"));
        checkInvalid("9 atributos duplicados", "Atributo duplicado", """
                VARIABILES>
                structura Dato {
                    esto valor: numerus;
                    esto valor: textum;
                } finis;
                MUNERA>
                MAIOR>
                FINIS;
                """);
        checkInvalid("10 atributo faltante", "Falta valor", """
                VARIABILES>
                structura Persona {
                    esto nombre: textum;
                    esto edad: numerus;
                } finis;
                esto persona: Persona { nombre: "Ana" }
                MUNERA>
                MAIOR>
                FINIS;
                """);
        checkInvalid("11 indice fuera de rango", "Indice fuera de rango", """
                VARIABILES>
                series valores[2] : numerus {1, 2};
                MUNERA>
                MAIOR>
                valores[5] = 1;
                FINIS;
                """);
        checkInvalid("12 interrupcion fuera de ciclo", "solo puede usarse dentro de un ciclo", program("interrumpe;"));
        checkInvalid("13 reddere en actio", "Tipo de retorno incompatible", """
                VARIABILES>
                MUNERA>
                actio funcionVoidConRetorno() {
                    reddere 5;
                } finis;
                MAIOR>
                FINIS;
                """);
        checkInvalid("14 textum por numerus", "Operacion incompatible", program("esto x : textum \"hola\" * 2;"));
        checkInvalid("15 logico con numerus", "Corrupcion de Flujo", program("esto x : bool 1 && verum;"));
    }

    private static void checkValid(String name, String source) {
        total++;
        try {
            CompilationResult result = PIPELINE.compile(source);
            boolean ok = !result.errores().tieneErrores() && result.pigLatin() != null;
            report(name, ok, ok ? "" : errors(result));
        } catch (Exception exception) {
            report(name, false, "excepcion no controlada: " + exception);
        }
    }

    private static void checkInvalid(String name, String expectedMessage, String source) {
        total++;
        try {
            CompilationResult result = PIPELINE.compile(source);
            boolean semantic = result.errores().errores().stream()
                    .anyMatch(error -> error.fase() == CompilerError.Fase.SEMANTICA
                            && error.mensaje().contains(expectedMessage));
            report(name, semantic, semantic ? "" : errors(result));
        } catch (Exception exception) {
            report(name, false, "excepcion no controlada: " + exception);
        }
    }

    private static void report(String name, boolean ok, String detail) {
        if (ok) {
            passed++;
            System.out.println("PASS - " + name);
        } else {
            String failure = "FAIL - " + name + " | esperado vs obtenido: " + detail;
            failures.add(failure);
            System.out.println(failure);
        }
    }

    private static String errors(CompilationResult result) {
        return result.errores().errores().toString();
    }

    private static String program(String body) {
        return "VARIABILES>\nMUNERA>\nMAIOR>\n" + body + "\nFINIS;\n";
    }
}
