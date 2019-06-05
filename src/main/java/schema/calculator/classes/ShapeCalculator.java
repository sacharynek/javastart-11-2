package schema.calculator.classes;

import schema.calculator.interfaces.Calc2D;
import schema.calculator.interfaces.Calc3D;
import schema.shapes.abstractclasses.GeometricShape;
import schema.shapes.abstractclasses.Shape3D;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double shapeArea(GeometricShape shape) {
        return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        return 0;
    }
}
