package p1;

import java.util.Scanner;

public class YearTypeDefinitor {

    private static final String REGEX = "[0-9]{4}";

    private static Scanner scanner = new Scanner(System.in);

    private static int yearNumber;

    public static void main(String[] args) {
        getUserInput();

        System.out.println(defineYearType());
    }

    private static String defineYearType() {

        if (yearNumber % 4 == 0 || yearNumber % 400 == 0) {
            return "Leap";
        } else {
            return "Not Leap";
        }

    }

    private static void getUserInput() {
        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.matches(REGEX)) {
                yearNumber = Integer.parseInt(input);
                return;
            } else {
                System.out.println("Type in an integer, please!");
            }

        }
    }

}
