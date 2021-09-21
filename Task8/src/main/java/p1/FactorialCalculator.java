package p1;

public class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println(calculateFactorialOf(7));
    }

    private static int calculateFactorialOf(int number) {
        int factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }

}
