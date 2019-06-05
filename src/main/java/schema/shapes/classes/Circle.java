package schema.shapes.classes;

import schema.shapes.abstractclasses.GeometricShape;

public class Circle extends GeometricShape {

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getArea(){
        return Math.PI*this.getDiameter()*getDiameter();
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }



    @Override
    public String toString() {
        return "Koło o średnicy "+this.getDiameter();
    }
}
