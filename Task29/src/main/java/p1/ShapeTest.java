package p1;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(5, 15);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle area: " + (triangle.getArea()));
    }

}
