package p1;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparator {

    private static Scanner scanner = new Scanner(System.in);

    private static LocalDate userInput;

    public static void main(String[] args) {
        setUserDate();

        showDifferentDateParts();
    }

    private static void showDifferentDateParts() {
        LocalDate today = LocalDate.now();

        if (today.getYear() != userInput.getYear()) {
            System.out.println("Year differs. Your year: " + userInput.getYear()
                    + "; Our year: " + today.getYear());
        } if (!today.getMonth().equals(userInput.getMonth())) {
            System.out.println("Month differs. Your month: " + userInput.getMonth()
                    + "; Our month: " + today.getMonth());
        }

    }

    private static void setUserDate() {
        while (scanner.hasNext()) {

            String userInputString = scanner.next();
            try {
                userInput = LocalDate.parse(userInputString);
                return;
            } catch (RuntimeException rte) {
                System.out.println("Wrong input!");
                continue;
            }

        }
    }
}
