package schema.calculator.classes;

import schema.shapes.classes.Line2D;

public class LineCalc {

    public double lineLength(Line2D line) {

        return Math.sqrt((line.getX() * line.getX()) + (line.getY() * line.getY()));

    }
}
