package schema.calculator.classes;

import schema.shapes.classes.Line2D;

public class LineCalc {

    public double lineLength(Line2D line) {
        double xDiff = line.getX2() - line.getX1();
        double yDiff = line.getY2() - line.getY1();
        return Math.sqrt((xDiff*xDiff)+(yDiff*yDiff));

    }
}
