import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Kliki ringil");

        Circle ring = new Circle(50);
        ring.setCenterX(100);
        ring.setCenterY(70);

        pane.getChildren().add(ring);

        primaryStage.show();

        ring.setOnMouseClicked(event -> {
            System.out.println("KLIKK");
            ring.setFill(Color.BLUE);
            ring.setCenterX(100);
            ring.setCenterY(150);

        });

    }
}
