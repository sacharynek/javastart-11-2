package schema.shapes.classes;

import schema.shapes.abstractclasses.Shape3D;

public class Ball extends Shape3D {

    private double diameter;

    public Ball(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume(){
        return 4.0/3.0*Math.PI*this.getDiameter()*this.getDiameter()*this.getDiameter();
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Kula o średnicy wynoszącej " + this.getDiameter();
    }
}
