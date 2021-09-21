package p1;

public class MultiplicationTable {
    private static final int FIVE = 5;

    public static void main(String[] args) {
        printMultiplicationTable();
    }

    private static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + FIVE + " = " + (i * FIVE));
        }
    }
}
