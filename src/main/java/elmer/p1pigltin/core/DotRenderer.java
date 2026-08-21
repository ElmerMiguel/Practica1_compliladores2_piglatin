package elmer.p1pigltin.core;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public final class DotRenderer {
    private DotRenderer() { }

    public static Optional<Path> renderizarPng(String dotContent, Path salidaPng) {
        Path dotFile = null;
        try {
            Path parent = salidaPng.toAbsolutePath().getParent();
            if (parent != null) Files.createDirectories(parent);
            dotFile = Files.createTempFile("codex-latinus-", ".dot");
            Files.writeString(dotFile, dotContent, StandardCharsets.UTF_8);
            Process process = new ProcessBuilder("dot", "-Tpng", dotFile.toString(),
                    "-o", salidaPng.toString()).redirectErrorStream(true).start();
            if (process.waitFor() != 0) return Optional.empty();
            return Files.isRegularFile(salidaPng) ? Optional.of(salidaPng) : Optional.empty();
        } catch (IOException | InterruptedException exception) {
            if (exception instanceof InterruptedException) Thread.currentThread().interrupt();
            return Optional.empty();
        } finally {
            if (dotFile != null) {
                try {
                    Files.deleteIfExists(dotFile);
                } catch (IOException ignored) {
                    // El archivo temporal no afecta el resultado del renderer.
                }
            }
        }
    }
}