package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMaxOf4 {

    private static Scanner scanner = new Scanner(System.in);

    private static int max;
    private static String regex = "\\d+";

    public static void main(String[] args) {
        max = findMaxOf4();

        System.out.println(max);
    }

    private static int findMaxOf4() {
        ArrayList<Integer> inputDigits = new ArrayList<>();

        while (inputDigits.size() < 4) {
            String userInput = scanner.next();

            if (userInput.matches(regex)) {
                inputDigits.add(Integer.parseInt(userInput));
            } else {
                System.out.println("Type in an integer!");
            }
        }

        return inputDigits.stream().max(Integer::compare).get();
    }
}
