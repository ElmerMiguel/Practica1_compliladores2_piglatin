
package elmer.p1pigltin;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;

public class P1Pigltin {

    public static void main(String[] args) {
        String source = """
                VARIABILES>
                
                MUNERA>
                
                MAIOR>
                esto resultado : numerus 1 + 3;
                >> resultado;
                FINIS;
                """;

        CompilationResult result = new CompilationPipeline().compile(source);
        System.out.println(result.prettyPrint());
    }
}
