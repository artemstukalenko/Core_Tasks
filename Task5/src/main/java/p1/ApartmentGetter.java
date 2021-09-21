package p1;

import java.util.Scanner;

public class ApartmentGetter {

    private static Scanner scanner = new Scanner(System.in);

    private static String regex = "\\d+";
    private static int soughtApartmentNumber;

    private static final int AMOUNT_OF_APARTMENTS = 144;
    private static final int APARTMENTS_PER_ENTRANCE = 36;
    private static final int APARTMENTS_PER_FLOOR = 4;
    private static final int NUMBER_OF_FLOORS = 9;

    public static void main(String[] args) {
        getUserInput();

        calculateAndShowFloorAndEntrance();
    }

    private static void calculateAndShowFloorAndEntrance() {
        int floorNumber = 1;
        int entranceNumber = 1;

        int counter = 1;
        int globalCounter = 0;

        OUTER:
        while (entranceNumber <= 4){

            while (floorNumber <= NUMBER_OF_FLOORS) {

                while (counter <= APARTMENTS_PER_FLOOR) {
                    globalCounter++;

                    if (globalCounter == soughtApartmentNumber) {
                        break OUTER;
                    }

                    counter++;
                }

                counter = 1;
                floorNumber++;
            }

            floorNumber = 1;
            entranceNumber++;
        }

        System.out.println("This apartment is on " + floorNumber + " floor of "
                + entranceNumber + " entrance.");
    }


    private static void getUserInput() {
        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.matches(regex)) {
                soughtApartmentNumber = Integer.parseInt(input);
                if (soughtApartmentNumber > AMOUNT_OF_APARTMENTS || soughtApartmentNumber < 1) {
                    soughtApartmentNumber = 0;
                    System.out.println("There is no such apartment!");
                }
                return;
            } else {
                System.out.println("Type in an integer, please!");
            }

        }
    }


}
