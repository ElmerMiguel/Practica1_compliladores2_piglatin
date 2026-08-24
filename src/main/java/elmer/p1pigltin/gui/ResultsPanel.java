package elmer.p1pigltin.gui;

import elmer.p1pigltin.ast.AstDotExporter;
import elmer.p1pigltin.ast.AstNode;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;
import elmer.p1pigltin.core.CompilerError;
import elmer.p1pigltin.core.DotRenderer;
import elmer.p1pigltin.core.ParseStackRecorder.ParseStackSnapshot;
import elmer.p1pigltin.semantic.SymbolTable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ResultsPanel extends JPanel {
    private final JTabbedPane tabs = new JTabbedPane();

    private final DefaultTableModel errorsModel = new DefaultTableModel(
            new Object[] {"Fase", "Linea", "Columna", "Mensaje"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private final JTable errorsTable = new JTable(errorsModel);

    private final JTree astTree = new JTree(new DefaultMutableTreeNode("AST"));
    private final JLabel astGraphLabel = new JLabel("Sin grafica AST", JLabel.CENTER);
    private final JLabel astGraphStatus = new JLabel("DOT/PNG pendiente", SwingConstants.LEFT);

    private final DefaultTableModel symbolsModel = new DefaultTableModel(
            new Object[] {"Nombre", "Tipo", "Ambito", "Clase", "Detalle"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private final JTable symbolsTable = new JTable(symbolsModel);

    private final JList<String> stackList = new JList<>();
    private final JTextArea stackLog = new JTextArea();
    private final JLabel stackState = new JLabel("Paso: -/-", SwingConstants.LEFT);
    private final JButton prevButton = new JButton("Atras");
    private final JButton nextButton = new JButton("Siguiente");
    private List<ParseStackSnapshot> snapshots = List.of();
    private int snapshotIndex = -1;

    private final JTextArea pigLatinArea = new JTextArea();

    private BiConsumer<Integer, Integer> onErrorSelected;

    public ResultsPanel() {
        super(new BorderLayout());
        buildUi();
    }

    public void setCompilationResult(CompilationResult result) {
        if (result == null) {
            clear();
            return;
        }
        boolean valido = !result.errores().tieneErrores();
        loadErrors(result.errores().errores());
        loadAst(valido ? result.ast() : null);
        loadSymbols(result.tabla());
        loadStack(result.pila());
        pigLatinArea.setText(result.pigLatin() == null ? "" : result.pigLatin());
    }

    public String currentPigLatin() {
        return pigLatinArea.getText();
    }

    public void setOnErrorSelected(BiConsumer<Integer, Integer> callback) {
        this.onErrorSelected = callback;
    }

    public void clear() {
        errorsModel.setRowCount(0);
        loadAst(null);
        symbolsModel.setRowCount(0);
        loadStack(List.of());
        pigLatinArea.setText("");
    }

    private void buildUi() {
        errorsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        errorsTable.getSelectionModel().addListSelectionListener(this::onErrorRowSelected);

        tabs.addTab("Errores", new JScrollPane(errorsTable));
        tabs.addTab("AST", buildAstTab());
        tabs.addTab("Simbolos", new JScrollPane(symbolsTable));
        tabs.addTab("Pila", buildStackTab());

        pigLatinArea.setEditable(false);
        tabs.addTab("PigLatin", new JScrollPane(pigLatinArea));

        add(tabs, BorderLayout.CENTER);
    }

    private JPanel buildAstTab() {
        JPanel root = new JPanel(new BorderLayout());
        JSplitPane split = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(astTree),
                new JScrollPane(astGraphLabel)
        );
        split.setResizeWeight(0.35);
        root.add(split, BorderLayout.CENTER);
        root.add(astGraphStatus, BorderLayout.SOUTH);
        return root;
    }

    private JPanel buildStackTab() {
        JPanel root = new JPanel(new BorderLayout());
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(prevButton);
        controls.add(nextButton);
        controls.add(stackState);

        prevButton.addActionListener(e -> moveSnapshot(-1));
        nextButton.addActionListener(e -> moveSnapshot(1));

        stackLog.setEditable(false);
        JSplitPane split = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(stackList),
                new JScrollPane(stackLog)
        );
        split.setResizeWeight(0.7);

        root.add(controls, BorderLayout.NORTH);
        root.add(split, BorderLayout.CENTER);
        return root;
    }

    private void loadErrors(List<CompilerError> errors) {
        errorsModel.setRowCount(0);
        for (CompilerError error : errors) {
            errorsModel.addRow(new Object[] {
                    error.fase(),
                    error.linea(),
                    error.columna(),
                    error.mensaje()
            });
        }
    }

    private void loadAst(AstNode root) {
        DefaultMutableTreeNode rootNode = root == null
                ? new DefaultMutableTreeNode("AST vacio")
                : buildAstTree(root);
        astTree.setModel(new DefaultTreeModel(rootNode));
        for (int i = 0; i < astTree.getRowCount(); i++) {
            astTree.expandRow(i);
        }

        if (root == null) {
            astGraphLabel.setIcon(null);
            astGraphLabel.setText("Sin AST para graficar");
            astGraphStatus.setText("DOT/PNG pendiente");
            return;
        }

        renderGraphviz(root);
    }

    private void renderGraphviz(AstNode root) {
        String dot = AstDotExporter.exportar(root);
        Path output = Path.of("target", "gui", "ast-last.png");
        DotRenderer.renderizarPng(dot, output).ifPresentOrElse(path -> {
                    astGraphLabel.setIcon(new ImageIcon(path.toAbsolutePath().toString()));
                    astGraphLabel.setText("");
                    astGraphStatus.setText("AST PNG: " + path.toAbsolutePath());
                },
                () -> {
                    astGraphLabel.setIcon(null);
                    astGraphLabel.setText("Graphviz (dot) no disponible");
                    astGraphStatus.setText("Se genero DOT, pero no se pudo renderizar PNG");
                });
    }

    private DefaultMutableTreeNode buildAstTree(AstNode node) {
        String label = node.tipo + " " + node.attrs;
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(label);
        for (AstNode child : node.children) {
            treeNode.add(buildAstTree(child));
        }
        return treeNode;
    }

    private void loadSymbols(SymbolTable table) {
        symbolsModel.setRowCount(0);
        for (Map.Entry<String, SymbolTable.Symbol> entry : table.simbolosGlobales().entrySet()) {
            SymbolTable.Symbol symbol = entry.getValue();
            String type = symbol.declaredType() == null ? "-" : symbol.declaredType();
            String detail = buildDetail(symbol);
            symbolsModel.addRow(new Object[] {
                    symbol.name(),
                    type,
                    symbol.scope(),
                    symbol.kind(),
                    detail
            });
        }
    }

    private String buildDetail(SymbolTable.Symbol symbol) {
        return switch (symbol.kind()) {
            case ARRAY -> "elemento=" + symbol.elementType() + ", tam=" + symbol.size();
            case FUNCTION -> "params=" + symbol.parameterTypes();
            case STRUCTURE -> "campos=" + symbol.fields().keySet();
            case STRUCT_VARIABLE -> "struct=" + symbol.declaredType();
            case VARIABLE -> "-";
        };
    }

    private void loadStack(List<ParseStackSnapshot> snapshots) {
        this.snapshots = snapshots == null ? List.of() : new ArrayList<>(snapshots);
        this.snapshotIndex = this.snapshots.isEmpty() ? -1 : 0;
        refreshStackView();
    }

    private void moveSnapshot(int delta) {
        if (snapshots.isEmpty()) {
            return;
        }
        int newIndex = snapshotIndex + delta;
        if (newIndex < 0 || newIndex >= snapshots.size()) {
            return;
        }
        snapshotIndex = newIndex;
        refreshStackView();
    }

    private void refreshStackView() {
        prevButton.setEnabled(snapshotIndex > 0);
        nextButton.setEnabled(snapshotIndex >= 0 && snapshotIndex < snapshots.size() - 1);

        if (snapshotIndex < 0 || snapshots.isEmpty()) {
            stackList.setListData(new String[] {});
            stackLog.setText("Sin datos de pila.");
            stackState.setText("Paso: -/-");
            return;
        }

        ParseStackSnapshot snapshot = snapshots.get(snapshotIndex);
        List<String> stackTopFirst = snapshot.stack();
        stackList.setListData(stackTopFirst.toArray(String[]::new));

        StringBuilder log = new StringBuilder();
        log.append("Operacion: ").append(snapshot.operation()).append('\n');
        log.append("Regla: ").append(snapshot.rule()).append('\n');
        log.append("Profundidad: ").append(snapshot.stack().size()).append('\n');
        stackLog.setText(log.toString());
        stackState.setText("Paso: " + (snapshotIndex + 1) + "/" + snapshots.size());
    }

    private void onErrorRowSelected(ListSelectionEvent event) {
        if (event.getValueIsAdjusting()) {
            return;
        }
        if (onErrorSelected == null) {
            return;
        }
        int row = errorsTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        Object lineObj = errorsModel.getValueAt(row, 1);
        Object colObj = errorsModel.getValueAt(row, 2);
        if (lineObj instanceof Integer line && colObj instanceof Integer col) {
            onErrorSelected.accept(line, col);
        }
    }
}