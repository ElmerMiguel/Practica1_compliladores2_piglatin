package elmer.p1pigltin.semantic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {
    private final Deque<Scope> scopes = new ArrayDeque<>();

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
        return scopes.peek().symbols.putIfAbsent(name, Symbol.variable(name, type, scopes.peek().name)) == null;
    }

    public boolean declararArray(String name, String elementType, int size) {
        return scopes.peek().symbols.putIfAbsent(name,
                Symbol.array(name, elementType, size, scopes.peek().name)) == null;
    }

    public boolean declararStructVariable(String name, String structType) {
        return scopes.peek().symbols.putIfAbsent(name,
                new Symbol(name, null, scopes.peek().name, Kind.STRUCT_VARIABLE,
                        structType, null, -1, null)) == null;
    }

    public boolean declararStruct(String name, Map<String, Field> fields) {
        return scopes.peek().symbols.putIfAbsent(name,
                Symbol.structure(name, fields, scopes.peek().name)) == null;
    }

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

    public static final class Symbol {
        private final String name;
        private final Type type;
        private final String scope;
        private final Kind kind;
        private final String declaredType;
        private final String elementType;
        private final int size;
        private final Map<String, Field> fields;

        private Symbol(String name, Type type, String scope, Kind kind, String declaredType,
                   String elementType, int size, Map<String, Field> fields) {
            this.name = name;
            this.type = type;
            this.scope = scope;
            this.kind = kind;
            this.declaredType = declaredType;
            this.elementType = elementType;
            this.size = size;
            this.fields = fields == null ? Map.of() : Map.copyOf(fields);
        }

        private static Symbol variable(String name, Type type, String scope) {
            return new Symbol(name, type, scope, Kind.VARIABLE, type == null ? null : type.name(), null, -1, null);
        }

        private static Symbol array(String name, String elementType, int size, String scope) {
            return new Symbol(name, null, scope, Kind.ARRAY, elementType, elementType, size, null);
        }

        private static Symbol structure(String name, Map<String, Field> fields, String scope) {
            return new Symbol(name, null, scope, Kind.STRUCTURE, name, null, -1, fields);
        }

        public String name() { return name; }
        public Type type() { return type; }
        public String scope() { return scope; }
        public Kind kind() { return kind; }
        public String declaredType() { return declaredType; }
        public String elementType() { return elementType; }
        public int size() { return size; }
        public Map<String, Field> fields() { return fields; }
    }

    public enum Kind { VARIABLE, ARRAY, STRUCTURE, STRUCT_VARIABLE }

    public record Field(String name, String typeName, boolean array) { }

    public static final class Scope {
        private final String name;
        private final Map<String, Symbol> symbols = new LinkedHashMap<>();

        private Scope(String name) {
            this.name = name;
        }
    }
}