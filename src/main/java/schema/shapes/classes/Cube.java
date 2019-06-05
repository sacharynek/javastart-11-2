package schema.shapes.classes;

import schema.shapes.abstractclasses.Shape3D;

public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume(){
        return this.getSide()*this.getSide()*this.getSide();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Sześcian o długości krawędzi wynoszącej "+this.getSide();
    }
}
