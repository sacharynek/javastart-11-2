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
        return Math.PI * circle.getDiameter() * circle.getDiameter();
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA() * rectangle.getSideB();
    }

    @Override
    public double ballVolume(Ball ball) {

        return 4.0 / 3.0 * Math.PI * ball.getDiameter() * ball.getDiameter() * ball.getDiameter();
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getSide() * cube.getSide() * cube.getSide();
    }
}
