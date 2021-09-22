package p1;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    private double area;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public double getArea() {
        double semiPerimeter = 0;

        semiPerimeter = (getSideA() + getSideB() + getSideC())/2;

        area = Math.sqrt(semiPerimeter * (semiPerimeter - getSideA()) *
                (semiPerimeter - getSideB()) * (semiPerimeter - getSideC()));

        return area;
    }
}

class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
    }
}
