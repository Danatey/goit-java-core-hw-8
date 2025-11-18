import classes.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rhombus rhombus = new Rhombus();
        Ellipse ellipse = new Ellipse();

        ConsoleShapePrinter consoleShapePrinter = new ConsoleShapePrinter();

        consoleShapePrinter.print(circle);
        consoleShapePrinter.print(quad);
        consoleShapePrinter.print(triangle);
        consoleShapePrinter.print(rhombus);
        consoleShapePrinter.print(ellipse);
    }
}