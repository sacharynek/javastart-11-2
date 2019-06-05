package schema.shapes.classes;

import schema.shapes.abstractclasses.Shape3D;

public class Ball extends Shape3D {

    private double diameter;

    public Ball(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diameter=" + diameter +
                '}';
    }
}
