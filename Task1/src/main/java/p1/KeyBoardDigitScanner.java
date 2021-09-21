package p1;

import java.util.Scanner;

public class KeyBoardDigitScanner {

    private static String input = "";

    private static Scanner keyBoardScanner = new Scanner(System.in);
    private static String inputRegex = "[0-9]{5}";

    public static void main(String[] args) {

        listenToInput();
        showDigits();

    }

    private static void showDigits() {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    private static void listenToInput() {
        while (keyBoardScanner.hasNext()) {

            String next = keyBoardScanner.next();

            if (next.matches(inputRegex)) {
                input += next;
                break;
            }

            System.out.println("Type in only 5-digit numbers");
        }
    }
}
