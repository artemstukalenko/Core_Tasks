package p1;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class CatalogChecker implements Runnable {

    private CatalogVisitor visitor = new CatalogVisitor();

    private WatchService watchService;

    private Path pathToCheck = Paths.get("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task37\\src\\main\\resources\\catalog-to-check");

    private boolean poll = true;

    @Override
    public void run() {
        initWatchService();
        registerPath();

        startWalkFileTree();

        while (poll) {
            WatchKey key = null;
            try {
                key = watchService.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event kind : " + event.kind() + " - File : " + event.context());
            }
            poll = key.reset();
        }

    }

    private void startWalkFileTree() {
        try {
            Files.walkFileTree(pathToCheck,
                    visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void registerPath() {
        try {
            pathToCheck.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initWatchService() {
        try {
            watchService = FileSystems.getDefault().newWatchService();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
