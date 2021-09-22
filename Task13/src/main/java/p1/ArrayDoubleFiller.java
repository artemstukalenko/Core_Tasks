package p1;

import java.util.Arrays;

public class ArrayDoubleFiller {

    static int [] randomArray = new int[15];
    static int [] doubledArray = new int[randomArray.length * 2];

    public static void main(String[] args) {
        fillRandomArray();
        showArray(randomArray);
        fillDoubledArray();
        showArray(doubledArray);
    }

    private static void fillDoubledArray() {
        System.arraycopy(randomArray, 0, doubledArray, 0, randomArray.length);

        int i = 0;
        int j = 0;

        for (i = randomArray.length, j = 0; j < randomArray.length && i < doubledArray.length; i++, j++) {
            doubledArray[i] = randomArray[j]*2;
        }

    }

    private static void showArray(int [] arrayToShow) {
        System.out.println("Array:");
        Arrays.stream(arrayToShow).forEach(System.out::println);
    }

    private static void fillRandomArray() {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random()*100);
        }
    }
}
