package p1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CatalogStructurePrinter {

    public static void main(String[] args) {
        printCatalogStructure(Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks"));
    }

    private static void printCatalogStructure(Path path) {
        try {
            Files.walkFileTree(path, new CatalogVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class CatalogVisitor implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entering " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit " + dir);
        return FileVisitResult.CONTINUE;
    }
}