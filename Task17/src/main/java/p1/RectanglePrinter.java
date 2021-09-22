package p1;

public class RectanglePrinter {

    public static void main(String[] args) {
        new RectanglePrinter().printRectangle(7, 7);
    }

    private void printRectangle(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
