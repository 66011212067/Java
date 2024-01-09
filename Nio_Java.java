import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Nio_Java {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("my_dir");
        // Files.createDirectory(path);
        Files.delete(path);
    }
}
