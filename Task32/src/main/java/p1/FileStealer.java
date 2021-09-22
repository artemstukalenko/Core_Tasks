package p1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStealer {

    public static void main(String[] args) {
        try {
            Files.walkFileTree(Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task32\\src\\main\\resources"),
                    new CatalogVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class CatalogVisitor implements FileVisitor<Path> {

    private static Path srcPath = Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task32\\src\\main\\resources\\src");
    private static Path destPath = Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task32\\src\\main\\resources\\dest");

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();

        if (fileName.endsWith(".txt")) {
            Files.copy(srcPath.resolve(fileName), destPath.resolve(fileName));
        }

        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}