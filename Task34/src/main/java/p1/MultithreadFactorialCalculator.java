package p1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadFactorialCalculator {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i <= 100; i++) {
            executorService.execute(new FactorialCalculator());
        }

        executorService.shutdown();
    }
}

class FactorialCalculator implements Runnable {

    private long threadNumber = Thread.currentThread().getId();

    @Override
    public void run() {
        System.out.println("Factorial of " + threadNumber + " is " + getFactorial());
    }

    private long getFactorial() {

        long factorial = 1;

        for (long i = threadNumber; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }
}