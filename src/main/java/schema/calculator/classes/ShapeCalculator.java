package schema.calculator.classes;

import schema.calculator.interfaces.Calc2D;
import schema.calculator.interfaces.Calc3D;
import schema.shapes.classes.Ball;
import schema.shapes.classes.Circle;
import schema.shapes.classes.Cube;
import schema.shapes.classes.Rectangle;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return 0;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return 0;
    }

    @Override
    public double ballVolume(Ball ball) {
        return 0;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return 0;
    }
}
