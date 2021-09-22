package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersArrayCreator {

    int [] usersArray;

    private Scanner scanner = new Scanner(System.in);

    private static final String REGEX = "\\d+";

    public static void main(String[] args) {

        EvenNumbersArrayCreator creator = new EvenNumbersArrayCreator();

        creator.setSize();
        creator.fillArray();
        creator.showArray();
    }

    private void showArray() {
        System.out.println("Array:");
        Arrays.stream(usersArray).forEach(System.out::println);
    }

    private void fillArray() {

        int placeCounter = 0;

        while (placeCounter < usersArray.length) {
            String input = scanner.next();

            if (input.matches(REGEX)) {
                usersArray[placeCounter++] = Integer.parseInt(input);
                continue;
            } else {
                System.out.println("Type in an integer!");
            }

        }

    }

    private void setSize() {

        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.matches(REGEX)) {
                usersArray = new int[Integer.parseInt(input)];
                return;
            } else {
                System.out.println("Type in an integer!");
            }

        }

    }
}
