package javaFx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OkButHandler implements EventHandler<ActionEvent>{
    private int count = 0;

    @Override
    public void handle(ActionEvent event){
        count++;
        System.out.println("OK Button pressed " + count + " time(s)");
    }
}
