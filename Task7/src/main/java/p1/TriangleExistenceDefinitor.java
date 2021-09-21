package p1;

public class TriangleExistenceDefinitor {

    public static void main(String[] args) {
        System.out.println(doesTriangleExist(3, 3, 3));
    }

    private static boolean doesTriangleExist(int sideA, int sideB, int sideC) {

        if (((sideA + sideB) > sideC) || ((sideB + sideC) > sideA)
                || ((sideA + sideC) > sideB)) {
            return true;
        } else {
            return false;
        }

    }
}
