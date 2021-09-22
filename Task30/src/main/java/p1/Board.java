package p1;

import p1.shapes.Shape;

import java.util.Arrays;

public class Board {
    private Shape[] boardSpace = new Shape[4];

    public void removeShape(Shape shapeToRemove) {
        for (int i = 0; i < boardSpace.length; i++) {
            if (boardSpace[i].equals(shapeToRemove)) {
                boardSpace[i] = null;
                return;
            }
        }
    }

    public void addShape(Shape shapeToAdd) {
        for (int i = 0; i < boardSpace.length; i++) {
            if (boardSpace[i] == null) {
                boardSpace[i] = shapeToAdd;
                return;
            }
        }
    }

    public void printShapeInfo() {
        Arrays.stream(boardSpace).filter(shape -> shape != null).forEach(System.out::println);

        System.out.println("-----------------------");
        System.out.println(Arrays.stream(boardSpace).filter(shape -> shape != null).mapToDouble(shape -> shape.getArea()).sum());
    }
}
