import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.scene.control.*;
public class commonPropertyfx extends Application {

    public void start(Stage stage){
        Button b = new Button("Click-me");
        b.setTextFill(Color.PINK);
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();
    }
   public static void main() {
    launch();
    }
}
