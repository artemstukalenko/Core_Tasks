package p1;

import java.util.Arrays;

public class SumOddNumbers {

    private static int [] numberArray = {0,5,2,4,7,1,3,19};

    public static void main(String[] args) {
        System.out.println(getSumOfOddNumbersInArray());
    }

    private static int getSumOfOddNumbersInArray() {
        return Arrays.stream(numberArray).filter(number -> (number % 2) != 0).sum();
    }
}
