package schema.shapes.classes;

import schema.shapes.abstractclasses.GeometricShape;

public class Circle extends GeometricShape {

    private double diameter;

    public Circle(double diameter) {
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
        return "Circle{" +
                "diameter=" + diameter +
                '}';
    }
}
