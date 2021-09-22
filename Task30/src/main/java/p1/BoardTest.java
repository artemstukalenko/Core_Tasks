package p1;

import p1.shapes.Circle;
import p1.shapes.Rectangle;
import p1.shapes.Shape;
import p1.shapes.Triangle;

public class BoardTest {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(5, 15);
        Shape triangle = new Triangle(3, 4, 5);

        Board board = new Board();
        board.addShape(circle);
        board.addShape(rectangle);
        board.addShape(triangle);

        board.printShapeInfo();

        board.removeShape(circle);

        board.printShapeInfo();
    }
}
