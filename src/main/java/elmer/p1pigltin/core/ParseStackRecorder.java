package elmer.p1pigltin.core;

import elmer.p1pigltin.antlr4.CodexLatinusParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ParseStackRecorder implements ParseTreeListener {
    private final Deque<String> stack = new ArrayDeque<>();
    private final List<ParseStackSnapshot> snapshots = new ArrayList<>();

    @Override
    public void enterEveryRule(ParserRuleContext context) {
        String rule = ruleName(context);
        stack.push(rule);
        snapshots.add(new ParseStackSnapshot("SHIFT", rule, stack));
    }

    @Override
    public void exitEveryRule(ParserRuleContext context) {
        String rule = ruleName(context);
        snapshots.add(new ParseStackSnapshot(
                "program".equals(rule) ? "ACCEPT" : "REDUCE", rule, stack));
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // La pila solicitada representa reglas del parser, no tokens individuales.
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // Los errores sintacticos ya se registran mediante CodexErrorListener.
    }

    public List<ParseStackSnapshot> snapshots() {
        return Collections.unmodifiableList(new ArrayList<>(snapshots));
    }

    private String ruleName(ParserRuleContext context) {
        int index = context.getRuleIndex();
        if (index >= 0 && index < CodexLatinusParser.ruleNames.length) {
            return CodexLatinusParser.ruleNames[index];
        }
        return context.getClass().getSimpleName().replace("Context", "");
    }

    public static final class ParseStackSnapshot {
        private final String operation;
        private final String rule;
        private final List<String> stack;

        private ParseStackSnapshot(String operation, String rule, Deque<String> stack) {
            this.operation = operation;
            this.rule = rule;
            this.stack = List.copyOf(stack);
        }

        public String operation() {
            return operation;
        }

        public String rule() {
            return rule;
        }

        public List<String> stack() {
            return stack;
        }

        @Override
        public String toString() {
            return operation + " " + rule + " " + stack;
        }
    }
}