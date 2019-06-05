import schema.calculator.classes.ShapeCalculator;
import schema.shapes.classes.Ball;
import schema.shapes.classes.Circle;
import schema.shapes.classes.Cube;
import schema.shapes.classes.Line2D;
import schema.shapes.classes.Rectangle;

public class Main {

    public static void main(String[] args) {

        Line2D line1 = new Line2D(0, 10);
        Ball ball1 = new Ball(1);
        Cube cube1 = new Cube(2);
        Circle circle1 = new Circle(1);
        Rectangle rectangle1 = new Rectangle(2, 4);

        ShapeCalculator sc = new ShapeCalculator();
        System.out.println(sc.ballVolume(ball1));
        System.out.println(sc.cubeVolume(cube1));
        System.out.println(sc.circleArea(circle1));
        System.out.println(sc.rectangleArea(rectangle1));
        System.out.println(sc.lineLength(line1));
    }
}
