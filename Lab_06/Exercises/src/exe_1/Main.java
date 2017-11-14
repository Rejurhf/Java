package exe_1;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame{
    public static void main(String[] argv){
        Main shapeDrawer = new Main();
        MyPanel panel = new MyPanel();

        shapeDrawer.setSize(500,500);
        shapeDrawer.setVisible(true);
        shapeDrawer.add(panel);

        shapeDrawer.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }
}
