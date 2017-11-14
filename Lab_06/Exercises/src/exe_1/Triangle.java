package exe_1;

import java.awt.*;

public class Triangle extends Shape{
    public void draw(Graphics shape){
        int x = 100, y = 100;
        String s = "Triangle";
        Graphics g = shape;
        g.drawString(s,x,y);
    }
}
