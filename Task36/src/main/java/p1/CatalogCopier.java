package p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CatalogCopier implements Runnable {

    private CatalogVisitor visitor = new CatalogVisitor();

    @Override
    public void run() {

        try {
            Files.walkFileTree(Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task36\\src\\main\\resources\\source"),
                    visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
