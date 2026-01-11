import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class javafx extends Application {

public  void start(Stage stage)
{
    Button b = new Button("Click me");
    FlowPane fp  = new FlowPane();
    fp.getChildren().add(b);
    Scene sc = new Scene(fp);

    stage.setScene(sc);
    stage.show();
}
        public static void main(String[] args) {
            launch();
        }
}

