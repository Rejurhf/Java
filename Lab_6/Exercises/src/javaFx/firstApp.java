package javaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class firstApp extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button okButton = new Button("OK");
        Scene scene = new Scene(okButton, 200, 250);
        primaryStage.setTitle("First App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] argv){
        launch(argv);
    }
}
