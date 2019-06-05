import schema.calculator.classes.ShapeCalculator;
import schema.shapes.abstractclasses.GeometricShape;
import schema.shapes.abstractclasses.Shape;
import schema.shapes.abstractclasses.Shape3D;
import schema.shapes.classes.Ball;
import schema.shapes.classes.Circle;
import schema.shapes.classes.Cube;
import schema.shapes.classes.Line2D;
import schema.shapes.classes.Rectangle;

public class Main {

    public static void main(String[] args) {

        Shape tab[] = new Shape[5];

        tab[0] = new Line2D(0, 10, 0, 0);
        tab[1] = new Ball(1);
        tab[2] = new Cube(2);
        tab[3] = new Circle(1);
        tab[4] = new Rectangle(2, 4);

        ShapeCalculator sc = new ShapeCalculator();

        for (Shape shape : tab) {
            System.out.print(shape);
            if (shape instanceof Line2D) {
                System.out.format(" ma powierzchnie %.2f",sc.lineLength((Line2D) shape));
            }
            if (shape instanceof Shape3D) {
                System.out.format(" ma objętość %.2f",sc.volume((Shape3D) shape));
            }
            if (shape instanceof GeometricShape) {
                System.out.format(" ma powierzchnię %.2f",sc.shapeArea((GeometricShape) shape));
            }
            System.out.println();
        }


    }
}
