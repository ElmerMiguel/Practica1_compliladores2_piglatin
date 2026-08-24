package elmer.p1pigltin.core;

/**
 * error  de compilacion, posit.
 */
public record CompilerError(Fase fase, String mensaje, int linea, int columna) {
    public enum Fase { LEXICA, SINTACTICA, SEMANTICA }

    @Override
    public String toString() {
        return fase + " (" + linea + ":" + columna + "): " + mensaje;
    }
}