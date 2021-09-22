package p1;

import static p1.Vector3d.sumVectors;

public class Vector3d {
    private int x;
    private int y;
    private int z;

    public Vector3d(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public static Vector3d sumVectors(Vector3d v1, Vector3d v2) {
        return new Vector3d((v1.getX() + v2.getX()), (v1.getY() + v2.getY()),
                (v1.getZ() + v2.getZ()));
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

class VectorTest {
    public static void main(String[] args) {
        Vector3d v1 = new Vector3d(3, 4, 4);
        Vector3d v2 = new Vector3d(5, 5, 6);

        System.out.println(sumVectors(v1, v2));
    }
}