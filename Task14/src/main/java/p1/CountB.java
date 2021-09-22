package p1;

import java.util.Scanner;

public class CountB {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(countB());
    }

    private static int countB() {
        int bCounter = 0;

        String stringToCountB = scanner.next();

        for (char c : stringToCountB.toCharArray()) {
            if (c == 'b') {
                bCounter++;
            }
        }

        return bCounter;
    }
}
