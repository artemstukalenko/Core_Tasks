package p1;

public class TriangleAreaCalculator {

    private static Triangle triangle;

    public TriangleAreaCalculator(Triangle triangle) {
        this.triangle = triangle;
    }

    public static void main(String[] args) {
        triangle = new Triangle(3, 4, 5);

        System.out.println(calculateArea(triangle));
    }

    private static double calculateArea(Triangle triangle) {
        double area = 0;
        double semiPerimeter = 0;

        semiPerimeter = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC())/2;

        area = Math.sqrt(semiPerimeter * (semiPerimeter - triangle.getSideA()) *
                (semiPerimeter - triangle.getSideB()) * (semiPerimeter - triangle.getSideC()));

        return area;
    }

}

class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}