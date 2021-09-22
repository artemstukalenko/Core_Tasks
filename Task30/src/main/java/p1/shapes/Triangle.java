package p1.shapes;

import java.util.Objects;

public class Triangle extends Shape {
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

    @Override
    public double getArea() {
        double semiPerimeter = 0;

        semiPerimeter = (getSideA() + getSideB() + getSideC())/2;

        area = Math.sqrt(semiPerimeter * (semiPerimeter - getSideA()) *
                (semiPerimeter - getSideB()) * (semiPerimeter - getSideC()));

        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", area=" + area +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC && Double.compare(triangle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, area);
    }
}