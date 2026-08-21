package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;
import elmer.p1pigltin.ast.AstDotExporter;
import elmer.p1pigltin.core.DotRenderer;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class P1Pigltin {
    public static void main(String[] args) {
        CompilationPipeline pipeline = new CompilationPipeline();
        printResult("PERSONA", pipeline.compile("""
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
                """));

        printResult("ANIMAL Y SELVA", pipeline.compile("""
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
                """));

        printResult("ARREGLOS", pipeline.compile("""
                VARIABILES>
                series mis_enteros[2] : numerus {1, 1};
                series nombres[2] : textum {"Hola", "Adios"};
                MUNERA>
                MAIOR>
                >> nombres[0];
                FINIS;
                """));

        printResult("CICLOS", pipeline.compile("""
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
                """));

        printResult("EJEMPLO COMPLETO", pipeline.compile("""
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
                } finis;
                >> "Tu poder es: " >> calcularPoder(fuerza);
                >> "La puerta esta cifrada?" >> cifrado;
                FINIS;
                """));

        printResult("ERROR ATRIBUTO DUPLICADO", pipeline.compile("""
                VARIABILES>
                structura Dato {
                    esto valor: numerus;
                    esto valor: textum;
                } finis;
                MUNERA>
                MAIOR>
                FINIS;
                """));

        printResult("ERROR INTERRUMPE FUERA DE CICLO", pipeline.compile("""
                VARIABILES>
                MUNERA>
                MAIOR>
                interrumpe;
                FINIS;
                """));

            printResult("ERROR INDICE CONSTANTE COMPUESTO", pipeline.compile("""
                VARIABILES>
                series valores[4] : numerus {1, 2, 3, 4};
                MUNERA>
                MAIOR>
                valores[2 + 3] = 1;
                FINIS;
                """));
    }

    private static void printResult(String title, CompilationResult result) {
        System.out.println("====================================");
        System.out.println(title);
        System.out.println(result.prettyPrint());
        if (result.errores().tieneErrores()) {
            System.out.println("Resultado: ERROR SEMANTICO/SINTACTICO");
        } else {
            System.out.println("Resultado: VALIDO");
            System.out.println("PigLatin:");
            System.out.println(result.pigLatin());
            if (title.equals("EJEMPLO COMPLETO")) {
                exportarAst(result);
            }
        }
    }

    private static void exportarAst(CompilationResult result) {
        try {
            Path directory = Path.of("target");
            Files.createDirectories(directory);
            Path dotPath = directory.resolve("ast-complete.dot");
            Path pngPath = directory.resolve("ast-complete.png");
            Files.writeString(dotPath, AstDotExporter.exportar(result.ast()), StandardCharsets.UTF_8);
            DotRenderer.renderizarPng(Files.readString(dotPath), pngPath)
                    .ifPresentOrElse(
                            path -> System.out.println("AST PNG generado: " + path.toAbsolutePath()),
                            () -> System.out.println("AST DOT generado; Graphviz no produjo PNG"));
            System.out.println("AST DOT generado: " + dotPath.toAbsolutePath());
        } catch (Exception exception) {
            System.out.println("No se pudo exportar el AST: " + exception.getMessage());
        }
    }
}
