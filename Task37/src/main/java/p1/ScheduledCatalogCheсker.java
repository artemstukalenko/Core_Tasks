package p1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledCatalogCheсker {
    public static void main(String[] args) {
        CatalogChecker catalogChecker1 = new CatalogChecker();

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        Thread checkersThread = new Thread(catalogChecker1);
        checkersThread.setDaemon(true);

        service.schedule(checkersThread, 1, TimeUnit.SECONDS);

        try {
            service.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        service.shutdown();

        System.out.println("Program terminated");
    }
}
