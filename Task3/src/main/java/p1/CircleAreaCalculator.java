package p1;

import java.util.Scanner;

public class CircleAreaCalculator {

    private static Scanner scanner = new Scanner(System.in);

    private static double radius;

    private static String onlyDigitsRegex = "^[0-9]+(.|,)?[0-9]?$";

    public static void main(String[] args) {

        setRadius();

        System.out.println(calculateArea(radius));
    }

    private static double calculateArea(double radius) {
        return Math.PI * (radius * radius);
    }

    private static void setRadius() {
        while (scanner.hasNext()) {

            String input = scanner.next();

            if (input.matches(onlyDigitsRegex)) {
                radius = Double.parseDouble(input);
                return;
            }

            System.out.println("Type in a number, please");
        }
    }
}
