package exe_1;

import java.awt.*;
import java.util.LinkedList;

public class MyPanel extends Panel{
    private LinkedList<Shape> shapeList = new LinkedList<>();

    MyPanel(){
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(circle);
    }

    @Override
    public void paint(Graphics g) {
        for (Shape shape:shapeList)
            shape.draw(g);
    }
}
