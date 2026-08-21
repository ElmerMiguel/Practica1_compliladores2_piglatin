
package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;

public class P1Pigltin {

    public static void main(String[] args) {
        String validSource = """
                VARIABILES>
                series mis_enteros[2] : numerus {1, 1};
                series nombres[2] : textum {"Hola", "Adios"};
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
                mis_enteros[1] = 4;
                >> mi_personaje.nombre;
                FINIS;
                """;

        String invalidSource = """
                VARIABILES>
                series valores[2] : numerus {1, 2};
                structura Dato {
                    esto valor: numerus;
                    esto valor: textum;
                } finis;
                MAIOR>
                valores[4] = 3;
                FINIS;
                """;

        String nestedSource = """
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
                FINIS;
                """;

        CompilationPipeline pipeline = new CompilationPipeline();
        printResult("CASO VALIDO", pipeline.compile(validSource));
        printResult("CASO INVALIDO", pipeline.compile(invalidSource));
        printResult("CASO ANIDADO", pipeline.compile(nestedSource));
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
