package javaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class firstApp extends Application{
    private int lambdaCount = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btnOK = new Button("OK");
        btnOK.setOnAction(new OkButHandler());

        Button btnCancel = new Button("Cancel");
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            private int count = 0;
            @Override
            public void handle(ActionEvent event) {
                count++;
                System.out.println("Cancle Button pressed " + count + " time(s)");
            }
        });
        btnCancel.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Mouse over Cancel button");
                btnCancel.setTextFill(Color.RED);
            }
        });
        btnCancel.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Mouse no longer over Cancel button");
                btnCancel.setTextFill(Color.BLACK);
            }
        });

        Button btnLambda = new Button("Lambda");
        btnLambda.setOnAction(event -> {
                    lambdaCount++;
                    System.out.println("And that is how lambda works, pressed " + lambdaCount + " time(s)");
        });
        btnLambda.setOnMouseEntered(event -> {
            System.out.println("Mouse over Lambda button");
            btnLambda.setTextFill(Color.BLUE);
        });
        btnLambda.setOnMouseExited(event -> {
            System.out.println("Mouse no longer over Lambda button");
            btnLambda.setTextFill(Color.BLACK);
        });
        btnLambda.setOnKeyPressed(event -> {
            switch (event.getCode()){
                case O:
                    System.out.println("\"O\" on lambda pressed");
                    break;
                case K:
                    System.out.println("\"K\" on lambda pressed");
                    break;
            }
        });

        HBox pane = new HBox();
        pane.getChildren().addAll(btnOK, btnCancel, btnLambda);
        Scene scene = new Scene(pane, 200, 250);

        primaryStage.setTitle("First App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] argv){
        launch(argv);
    }
}
