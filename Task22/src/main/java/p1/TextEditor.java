package p1;

import java.io.*;
import java.util.Scanner;

public class TextEditor {

    private static Scanner scanner = new Scanner(System.in);

    private static String userInput = "";

    public static void main(String[] args) {
        listenToInput();

        if(wannaSave()) {
            try {
                save();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return;
        }
    }

    private static void save() throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter("saved-text.txt");

            for (int i = 0; i < userInput.length(); i++) {
                writer.write(userInput.charAt(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    private static boolean wannaSave() {
        System.out.println("Wanna save? Y/N");

        while (scanner.hasNext()) {
            if (scanner.next().equals("Y")) {
                return true;
            } else if (scanner.next().equals("N")) {
                return false;
            } else {
                System.out.println("Wrong input!");
                continue;
            }
        }

        return false;
    }

    private static void listenToInput() {

        System.out.println("Print 'exit' to exit");

        while (scanner.hasNext()) {
            String input = scanner.next();

            if(input.equals("exit")) {
                return;
            }

            userInput += "\n" + input;
        }
    }
}
