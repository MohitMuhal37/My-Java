import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;
public class eventFX extends Application{

    public void start(Stage stage){
        Button b = new Button("click me");
        b.setPrefSize(100.0,70.0);
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp);
        stage.setTitle("Event Handling");
        stage.setScene(sc);
        stage.show();
    }
    public static void main() {
    launch();
    }

}
