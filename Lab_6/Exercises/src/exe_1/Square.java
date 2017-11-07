package exe_1;

import java.awt.*;

public class Square extends Shape{
    public void draw(Graphics shape){
        int x = 200, y = 200, s = 50;
        Graphics g = shape;
        g.drawRect(x, y, s, s);
    }
}
