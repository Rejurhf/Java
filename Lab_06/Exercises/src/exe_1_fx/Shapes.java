package exe_1_fx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Shapes extends Application{
    double orgSceneX, orgSceneY;
    double orgTransX, orgTransY;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(75);
        circle.setFill(Color.RED);
        circle.setCursor(Cursor.HAND);
        circle.setOnMousePressed(circlePressedEventHendler);
        circle.setOnMouseDragged(circleDraggedEventHendler);

        Rectangle rectangle = new Rectangle(250, 30, 100, 160);
        rectangle.setFill(Color.BLUE);
        rectangle.setCursor(Cursor.HAND);
        rectangle.setOnMousePressed(rectanglePressedEventHendler);
        rectangle.setOnMouseDragged(rectangleDraggedEventHendler);

        Rectangle sqare = new Rectangle(25, 205, 150, 150);
        sqare.setFill(Color.GREEN);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(300.0, 205.0,
                225.0, 355.0,
                375.0, 355.0);

        Text mousePos = new Text(170, 380, "X: 0.0 Y: 0.0");
        scene.setOnMouseMoved(event -> {mousePos.setText("X: " + event.getX() + " Y: " + event.getY());});

        root.getChildren().addAll(circle, rectangle, sqare, triangle, mousePos);
        primaryStage.setTitle("Shapes");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] argv){
        launch(argv);
    }

    EventHandler<MouseEvent> circlePressedEventHendler = new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent event) {
            orgSceneX = event.getSceneX();
            orgSceneY = event.getSceneY();
            orgTransX = ((Circle)(event.getSource())).getTranslateX();
            orgTransY = ((Circle)(event.getSource())).getTranslateY();
        }
    };

    EventHandler<MouseEvent> circleDraggedEventHendler = new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent event) {
            double offsetX = event.getSceneX() - orgSceneX;
            double offsetY = event.getSceneY() - orgSceneX;
            double newTrnslX = orgTransX + offsetX;
            double newTrnslY = orgTransY + offsetY;
            ((Circle)(event.getSource())).setTranslateX(newTrnslX);
            ((Circle)(event.getSource())).setTranslateY(newTrnslY);
        }
    };

    EventHandler<MouseEvent> rectanglePressedEventHendler = new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent event) {
            orgSceneX = event.getSceneX();
            orgSceneY = event.getSceneY();
            orgTransX = ((Rectangle)(event.getSource())).getTranslateX();
            orgTransY = ((Rectangle)(event.getSource())).getTranslateY();
        }
    };

    EventHandler<MouseEvent> rectangleDraggedEventHendler = new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent event) {
            double offsetX = event.getSceneX() - orgSceneX;
            double offsetY = event.getSceneY() - orgSceneX;
            double newTrnslX = orgTransX + offsetX;
            double newTrnslY = orgTransY + offsetY;
            ((Rectangle)(event.getSource())).setTranslateX(newTrnslX);
            ((Rectangle)(event.getSource())).setTranslateY(newTrnslY);
        }
    };
}
