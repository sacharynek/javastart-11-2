package schema.shapes.classes;

import schema.shapes.abstractclasses.Shape2D;

public class Line2D extends Shape2D {

    private int x, y;


    public Line2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Line2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
