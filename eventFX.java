import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;
public class eventFX extends Application implements EventHandler<ActionEvent>
{
    int count = 0;
    Button b;
    public void start(Stage stage){
        b = new Button("click me");
        b.setOnAction(this);
        b.setPrefSize(100.0,70.0);
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp);
        stage.setTitle("Event Handling");
        stage.setScene(sc);
        stage.show();
    }

    public void handle(ActionEvent e){
        count++;
        b.setText(" "+count);
    }
    public static void main() {
    launch();
    }

}
