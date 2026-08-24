package elmer.p1pigltin.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * acumulador  de errores.
 */
public class ErrorReporter {
    private final List<CompilerError> errores = new ArrayList<>();

   
    public void report(CompilerError error) {
        errores.add(error);
    }

    public List<CompilerError> errores() {
        return Collections.unmodifiableList(errores);
    }

    public boolean tieneErrores() {
        return !errores.isEmpty();
    }
}