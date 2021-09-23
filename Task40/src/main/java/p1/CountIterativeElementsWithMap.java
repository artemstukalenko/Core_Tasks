package p1;

import java.util.HashMap;
import java.util.Map;

public class CountIterativeElementsWithMap {

    private static Integer[] array = {1, 2, 4, 4, 54, 7, 2, 1};

    private static Map<Integer, Integer> mapCounter = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {

            Integer check = mapCounter.get(array[i]);

            if (check == null) {
                mapCounter.put(array[i], 1);
            } else {
                mapCounter.put(array[i], check + 1);
            }

        }


        for (Map.Entry<Integer, Integer> entry : mapCounter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
