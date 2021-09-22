package p1;

import java.util.Arrays;

public class GetMaxNumberFromArray {

    public static void main(String[] args) {

        int [] array = {1, 4, 5346, 753, 788};

        System.out.println(getMaxNumberFromArray(array));
    }

    private static int getMaxNumberFromArray(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

}
