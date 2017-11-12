package exe_1_fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shapes extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(75);
        circle.setFill(Color.RED);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(220);
        rectangle.setY(50);
        rectangle.setHeight(100);
        rectangle.setWidth(160);
        rectangle.setFill(Color.BLUE);

        Rectangle sqare = new Rectangle(25, 225, 150, 150);
        sqare.setFill(Color.GREEN);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(300.0, 225.0,
                225.0, 375.0,
                375.0, 375.0);

        Group root = new Group(circle, rectangle, sqare, triangle);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] argv){
        launch(argv);
    }
}
