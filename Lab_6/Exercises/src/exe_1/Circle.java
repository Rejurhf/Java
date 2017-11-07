package exe_1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{
    public void draw(Graphics shape) {
        int x = 10, y = 10, r = 50;
        Graphics2D g2 = (Graphics2D) shape;
        Ellipse2D e = new Ellipse2D.Double(x,y,r,r);
        g2.draw(e);
        GradientPaint gp = new GradientPaint(x-r/2, y-r/2, Color.red,
                x+r/2, y+r/2, Color.blue, false);
        g2.setPaint(gp);
        g2.fill(e);

        //g2.draw(e);
    }
}
