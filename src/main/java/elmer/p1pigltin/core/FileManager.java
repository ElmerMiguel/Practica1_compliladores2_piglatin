package elmer.p1pigltin.core;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Component;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;


public class FileManager {
    public record LoadedFile(Path path, String content) {}

    public Optional<LoadedFile> openLatFile(Component parent) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Codex Latinus (*.lat)", "lat"));
        int result = chooser.showOpenDialog(parent);
        if (result != JFileChooser.APPROVE_OPTION) {
            return Optional.empty();
        }

        Path path = chooser.getSelectedFile().toPath();
        try {
            String content = Files.readString(path, StandardCharsets.UTF_8);
            return Optional.of(new LoadedFile(path, content));
        } catch (IOException exception) {
            throw new IllegalStateException("No se pudo abrir el archivo: " + path, exception);
        }
    }

    public Optional<Path> saveLatFile(Component parent, Path currentPath, String content) {
        if (currentPath == null) {
            return saveLatFileAs(parent, content);
        }
        writeContent(currentPath, content);
        return Optional.of(currentPath);
    }

    public Optional<Path> saveLatFileAs(Component parent, String content) {
        Optional<Path> selected = showSavePath(parent,
                "Codex Latinus (*.lat)",
                "lat",
                ".lat");
        selected.ifPresent(path -> writeContent(path, content));
        return selected;
    }

    public Optional<Path> exportPigFile(Component parent, String pigLatinContent) {
        Optional<Path> selected = showSavePath(parent,
                "Pig Latin (*.pig)",
                "pig",
                ".pig");
        selected.ifPresent(path -> writeContent(path, pigLatinContent));
        return selected;
    }

    private Optional<Path> showSavePath(Component parent,
                                        String description,
                                        String extension,
                                        String suffix) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter(description, extension));
        int result = chooser.showSaveDialog(parent);
        if (result != JFileChooser.APPROVE_OPTION) {
            return Optional.empty();
        }

        Path selected = chooser.getSelectedFile().toPath();
        String fileName = selected.getFileName().toString().toLowerCase();
        if (!fileName.endsWith(suffix)) {
            selected = selected.resolveSibling(selected.getFileName() + suffix);
        }
        return Optional.of(selected);
    }

    private void writeContent(Path path, String content) {
        try {
            Files.createDirectories(path.toAbsolutePath().getParent());
            Files.writeString(path, content == null ? "" : content, StandardCharsets.UTF_8);
        } catch (IOException exception) {
            throw new IllegalStateException("No se pudo guardar el archivo: " + path, exception);
        }
    }
}