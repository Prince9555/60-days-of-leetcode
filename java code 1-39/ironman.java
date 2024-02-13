 
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class IronManDrawing extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();

    // Create the head
    Circle head = new Circle(50, 50, 40);
    head.setFill(Color.RED);
    root.getChildren().add(head);

    // Create the body
    Rectangle body = new Rectangle(30, 90, 60, 100);
    body.setFill(Color.YELLOW);
    root.getChildren().add(body);

    // Create the arms
    Rectangle leftArm = new Rectangle(10, 110, 30, 70);
    leftArm.setFill(Color.YELLOW);
    root.getChildren().add(leftArm);

    Rectangle rightArm = new Rectangle(90, 110, 30, 70);
    rightArm.setFill(Color.YELLOW);
    root.getChildren().add(rightArm);

    // Create the legs
    Rectangle leftLeg = new Rectangle(40, 190, 20, 60);
    leftLeg.setFill(Color.YELLOW);
    root.getChildren().add(leftLeg);

    Rectangle rightLeg = new Rectangle(60, 190, 20, 60);
    rightLeg.setFill(Color.YELLOW);
    root.getChildren().add(rightLeg);

    Scene scene = new Scene(root, 120, 250);

    primaryStage.setTitle("Iron Man");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
