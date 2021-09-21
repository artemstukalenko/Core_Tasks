package p1;

public class PrimeNumbersPrinter {
    public static void main(String[] args) {
        OUTER:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue OUTER;
                }
            }
            System.out.println(i);
        }
    }
}
