package elmer.p1pigltin.semantic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * tabs de simbls con stack de ambitos para resolv nombrs por cercania.
 */
public class SymbolTable {
    private final Deque<Scope> scopes = new ArrayDeque<>();
    private final Map<String, Symbol> allSymbols = new LinkedHashMap<>();

    public SymbolTable() {
        enterScope("global");
    }

    public void enterScope(String name) {
        scopes.push(new Scope(name));
    }

    public void exitScope() {
        if (scopes.size() > 1) {
            scopes.pop();
        }
    }

    public boolean declarar(String name, Type type) {
        return register(name, Symbol.variable(name, type, scopes.peek().name));
    }

    public boolean declararArray(String name, String elementType, int size) {
        return register(name, Symbol.array(name, elementType, size, scopes.peek().name));
    }

    public boolean declararStructVariable(String name, String structType) {
        return register(name, new Symbol(name, null, scopes.peek().name, Kind.STRUCT_VARIABLE,
                structType, null, -1, null, List.of()));
    }

    public boolean declararStruct(String name, Map<String, Field> fields) {
        return register(name, Symbol.structure(name, fields, scopes.peek().name));
    }

    public boolean declararFuncion(String name, Type returnType, boolean actio) {
        return declararFuncion(name, returnType, actio, List.of());
    }

    public boolean declararFuncion(String name, Type returnType, boolean actio, List<Type> parameterTypes) {
        return register(name, Symbol.function(name, returnType, scopes.peek().name, actio, parameterTypes));
    }

    private boolean register(String name, Symbol symbol) {
        if (scopes.peek().symbols.containsKey(name)) return false;
        scopes.peek().symbols.put(name, symbol);
        allSymbols.put(symbol.scope() + ":" + name, symbol);
        return true;
    }

    /**
     * busca desde el scope actual hacia afuera.
     */
    public Symbol resolver(String name) {
        for (Scope scope : scopes) {
            Symbol symbol = scope.symbols.get(name);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }

    public Map<String, Symbol> simbolosGlobales() {
        return Map.copyOf(scopes.getLast().symbols);
    }

    public Map<String, Symbol> todosLosSimbolos() {
        return Map.copyOf(allSymbols);
    }

    public static final class Symbol {
        private final String name;
        private final Type type;
        private final String scope;
        private final Kind kind;
        private final String declaredType;
        private final String elementType;
        private final int size;
        private final Map<String, Field> fields;
        private final boolean actio;
        private final List<Type> parameterTypes;

        private Symbol(String name, Type type, String scope, Kind kind, String declaredType,
                       String elementType, int size, Map<String, Field> fields,
                       List<Type> parameterTypes) {
            this.name = name;
            this.type = type;
            this.scope = scope;
            this.kind = kind;
            this.declaredType = declaredType;
            this.elementType = elementType;
            this.size = size;
            this.fields = fields == null ? Map.of() : Map.copyOf(fields);
            this.actio = kind == Kind.FUNCTION && type == Type.VOID;
            this.parameterTypes = List.copyOf(parameterTypes);
        }

        private static Symbol variable(String name, Type type, String scope) {
            return new Symbol(name, type, scope, Kind.VARIABLE, type == null ? null : type.name(), null, -1, null, List.of());
        }

        private static Symbol array(String name, String elementType, int size, String scope) {
            return new Symbol(name, null, scope, Kind.ARRAY, elementType, elementType, size, null, List.of());
        }

        private static Symbol structure(String name, Map<String, Field> fields, String scope) {
            return new Symbol(name, null, scope, Kind.STRUCTURE, name, null, -1, fields, List.of());
        }

        private static Symbol function(String name, Type returnType, String scope, boolean actio,
                                       List<Type> parameterTypes) {
            return new Symbol(name, returnType, scope, Kind.FUNCTION,
                    returnType == null ? null : returnType.name(), null, -1, null,
                    parameterTypes);
        }

        public String name() { return name; }
        public Type type() { return type; }
        public String scope() { return scope; }
        public Kind kind() { return kind; }
        public String declaredType() { return declaredType; }
        public String elementType() { return elementType; }
        public int size() { return size; }
        public Map<String, Field> fields() { return fields; }
        public boolean actio() { return actio; }
        public List<Type> parameterTypes() { return parameterTypes; }
    }

    public enum Kind { VARIABLE, ARRAY, STRUCTURE, STRUCT_VARIABLE, FUNCTION }

    public record Field(String name, String typeName, boolean array) { }

    public static final class Scope {
        private final String name;
        private final Map<String, Symbol> symbols = new LinkedHashMap<>();

        private Scope(String name) {
            this.name = name;
        }
    }
}