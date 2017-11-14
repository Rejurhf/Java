package exe_1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] argv){
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        LinkedList<Shape> shapesList = new LinkedList<>();

        shapesList.add(square);
        shapesList.add(rectangle);
        shapesList.add(circle);
        shapesList.add(triangle);
        for (Shape shape:shapesList)
            shape.draw();
    }
}
