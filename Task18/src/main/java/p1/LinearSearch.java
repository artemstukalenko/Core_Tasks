package p1;

public class LinearSearch {

    private static int [] arrayToSearch = {1, 22, 43, 1, 325, 5};

    public static void main(String[] args) {
        System.out.println(findElement(43));
    }

    private static int findElement(int soughtElement) {
        for (int i = 0; i < arrayToSearch.length; i++) {
            if (arrayToSearch[i] == soughtElement) {
                return i;
            }
        }
        return -1;
    }
}
