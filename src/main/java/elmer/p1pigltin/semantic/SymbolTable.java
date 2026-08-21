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
        return scopes.peek().symbols.putIfAbsent(name, new Symbol(name, type, scopes.peek().name)) == null;
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

        public Symbol(String name, Type type, String scope) {
            this.name = name;
            this.type = type;
            this.scope = scope;
        }

        public String name() { return name; }
        public Type type() { return type; }
        public String scope() { return scope; }
    }

    public static final class Scope {
        private final String name;
        private final Map<String, Symbol> symbols = new LinkedHashMap<>();

        private Scope(String name) {
            this.name = name;
        }
    }
}