package schema.calculator.interfaces;

import schema.shapes.classes.Ball;
import schema.shapes.classes.Cube;

public interface Calc3D {

    double ballVolume(Ball ball);

    double cubeVolume(Cube cube);
}
