package p1;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadArrayCounter {

    static int[] array = {1, 15, 6, 7, 3, 45, 6, 23, 536, 75, 78, 88};

    public static void main(String[] args) {
        ArrayCounter counter1 = new ArrayCounter(array, 0, 3);
        ArrayCounter counter2 = new ArrayCounter(array, 3, 6);
        ArrayCounter counter3 = new ArrayCounter(array, 6, 9);
        ArrayCounter counter4 = new ArrayCounter(array, 9, 12);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);
        Thread thread3 = new Thread(counter3);
        Thread thread4 = new Thread(counter4);

        long timeBeforeThreads = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeAfterThreads = System.currentTimeMillis();

        System.out.println("Thread execution took " + (timeAfterThreads - timeBeforeThreads));

        long timeBeforeSingleThread = System.currentTimeMillis();

        calculateSumOfElements();

        long timeAfterSingleThread = System.currentTimeMillis();

        System.out.println("Single thread execution took " + (timeAfterSingleThread - timeBeforeSingleThread));

    }


    private static int calculateSumOfElements() {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

}

class ArrayCounter extends Thread {

    private int[] array;
    private int start;
    private int end;
    private int sum;

    public ArrayCounter(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }
}