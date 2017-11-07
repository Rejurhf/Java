package exe_1;

import java.awt.*;

public class Rectangle extends Shape{
    public void draw(Graphics shape){
        int x = 10, y = 200, w = 100, h = 50;
        Graphics g = shape;
        g.drawRect(x, y, w, h);

    }
}
