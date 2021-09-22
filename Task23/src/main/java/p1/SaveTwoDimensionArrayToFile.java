package p1;

import java.io.FileWriter;
import java.io.IOException;

public class SaveTwoDimensionArrayToFile {

    private final static int[][] ARRAY_TO_SAVE = {{1}, {2, 2}, {3, 3, 3}};

    public static void main(String[] args) {
        try {
            saveArrayToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveArrayToFile() throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter("saved-text.txt");

            for (int i = 0; i < ARRAY_TO_SAVE.length; i++) {
                for (int j = 0; j < ARRAY_TO_SAVE[i].length; j++) {
                    writer.write(ARRAY_TO_SAVE[i][j] + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
