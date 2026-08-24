package elmer.p1pigltin.gui;

import elmer.p1pigltin.core.CompilationPipeline;
import elmer.p1pigltin.core.CompilationPipeline.CompilationResult;
import elmer.p1pigltin.core.FileManager;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingWorker;
import java.awt.BorderLayout;
import java.nio.file.Path;

public class MainFrame extends JFrame {
    private final CompilationPipeline pipeline = new CompilationPipeline();
    private final FileManager fileManager = new FileManager();

    private final EditorPanel editorPanel = new EditorPanel();
    private final ResultsPanel resultsPanel = new ResultsPanel();

    private final JButton compileButton = new JButton("Compilar");
    private final JLabel statusLabel = new JLabel("Listo");

    private Path currentFile;

    public MainFrame() {
        super("Codex Latinus Compiler");
        CodexLatinusTokenMaker.register();
        configureUi();
        bindActions();
        loadInitialTemplate();
    }

    private void configureUi() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 850);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        setJMenuBar(buildMenuBar());
        add(buildToolBar(), BorderLayout.NORTH);

        JSplitPane leftColumn = new JSplitPane(
            JSplitPane.VERTICAL_SPLIT,
            editorPanel,
            resultsPanel.astPanel()
        );
        leftColumn.setResizeWeight(0.58);
        leftColumn.setOneTouchExpandable(true);

        JSplitPane rightColumn = new JSplitPane(
            JSplitPane.VERTICAL_SPLIT,
            resultsPanel.outputPanel(),
            resultsPanel.bottomRightPanel()
        );
        rightColumn.setResizeWeight(0.58);
        rightColumn.setOneTouchExpandable(true);

        JSplitPane mainSplit = new JSplitPane(
            JSplitPane.HORIZONTAL_SPLIT,
            leftColumn,
            rightColumn
        );
        mainSplit.setResizeWeight(0.5);
        mainSplit.setOneTouchExpandable(true);
        add(mainSplit, BorderLayout.CENTER);

        JPanel footer = new JPanel(new BorderLayout());
        footer.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));
        footer.add(statusLabel, BorderLayout.WEST);
        add(footer, BorderLayout.SOUTH);
    }

    private JMenuBar buildMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");

        fileMenu.add(new JMenuItem(new AbstractAction("Nuevo") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent event) {
                newFile();
            }
        }));
        fileMenu.add(new JMenuItem(new AbstractAction("Abrir") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent event) {
                openFile();
            }
        }));
        fileMenu.add(new JMenuItem(new AbstractAction("Guardar") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent event) {
                saveFile();
            }
        }));
        fileMenu.add(new JMenuItem(new AbstractAction("Exportar PigLatin") {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent event) {
                exportPigLatin();
            }
        }));

        menuBar.add(fileMenu);
        return menuBar;
    }

    private JToolBar buildToolBar() {
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);

        compileButton.addActionListener(e -> compileAsync());
        toolbar.add(compileButton);

        return toolbar;
    }

    private void bindActions() {
        resultsPanel.setOnErrorSelected(editorPanel::goTo);
    }

    private void loadInitialTemplate() {
        editorPanel.setCode("""
                VARIABILES>
                MUNERA>
                MAIOR>
                >> "Ave, mundus";
                FINIS;
                """);
    }

    private void compileAsync() {
        compileButton.setEnabled(false);
        statusLabel.setText("Compilando...");
        String source = editorPanel.getCode();

        SwingWorker<CompilationResult, Void> worker = new SwingWorker<>() {
            @Override
            protected CompilationResult doInBackground() {
                return pipeline.compile(source);
            }

            @Override
            protected void done() {
                try {
                    CompilationResult result = get();
                    resultsPanel.setCompilationResult(result);
                    int totalErrors = result.errores().errores().size();
                    statusLabel.setText(totalErrors == 0
                            ? "Compilacion exitosa"
                            : "Compilacion con " + totalErrors + " error(es)");
                } catch (Exception exception) {
                    statusLabel.setText("Error interno al compilar");
                    JOptionPane.showMessageDialog(
                            MainFrame.this,
                            exception.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                } finally {
                    compileButton.setEnabled(true);
                }
            }
        };
        worker.execute();
    }

    private void newFile() {
        currentFile = null;
        editorPanel.setCode("");
        resultsPanel.clear();
        updateTitle();
        statusLabel.setText("Nuevo archivo");
    }

    private void openFile() {
        try {
            fileManager.openLatFile(this).ifPresent(file -> {
                currentFile = file.path();
                editorPanel.setCode(file.content());
                resultsPanel.clear();
                updateTitle();
                statusLabel.setText("Archivo abierto: " + currentFile.getFileName());
            });
        } catch (Exception exception) {
            showError(exception.getMessage());
        }
    }

    private void saveFile() {
        try {
            if (currentFile == null) {
                fileManager.saveLatFileAs(this, editorPanel.getCode()).ifPresent(path -> {
                    currentFile = path;
                    updateTitle();
                    statusLabel.setText("Archivo guardado: " + path.getFileName());
                });
                return;
            }
            fileManager.saveLatFile(this, currentFile, editorPanel.getCode()).ifPresent(path ->
                    statusLabel.setText("Archivo guardado: " + path.getFileName()));
        } catch (Exception exception) {
            showError(exception.getMessage());
        }
    }

    private void exportPigLatin() {
        String pigLatin = resultsPanel.currentPigLatin();
        if (pigLatin == null || pigLatin.isBlank()) {
            JOptionPane.showMessageDialog(
                    this,
                    "No hay salida PigLatin para exportar. Compila un codigo valido primero.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        try {
            fileManager.exportPigFile(this, pigLatin).ifPresent(path ->
                    statusLabel.setText("PigLatin exportado: " + path.getFileName()));
        } catch (Exception exception) {
            showError(exception.getMessage());
        }
    }

    private void updateTitle() {
        String suffix = currentFile == null ? "(sin archivo)" : currentFile.toString();
        setTitle("Codex Latinus Compiler - " + suffix);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}