package p1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MultithreadCopy {
    public static void main(String[] args) {
        CatalogCopier copier1 = new CatalogCopier();
        CatalogCopier copier2 = new CatalogCopier();
        CatalogCopier copier3 = new CatalogCopier();

        Thread thread1 = new Thread(copier1);
        Thread thread2 = new Thread(copier2);
        Thread thread3 = new Thread(copier3);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Done!");
    }
}

