package p1;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class CatalogVisitor implements FileVisitor<Path> {

    private static Path srcPath = Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task36\\src\\main\\resources\\source");
    private static Path destPath = Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task36\\src\\main\\resources\\destination");

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public synchronized FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();

        try {
            Files.copy(srcPath.resolve(fileName), destPath.resolve(fileName));
        } catch (FileSystemException e) {

            if (new File(destPath.toString()).exists()) {
                return FileVisitResult.CONTINUE;
            }

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
