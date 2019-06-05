package schema.shapes.classes;

import schema.shapes.abstractclasses.GeometricShape;

public class Rectangle extends GeometricShape {

    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea(){
        return this.getSideA()*this.getSideB();
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

    @Override
    public String toString() {
        return "Prostokąt o długościach boków "+this.sideA + ", "+this.sideB;
    }
}
