import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.scene.control.*;


public class commonPropertyfx extends Application {

    public void start(Stage stage){
        Button b = new Button("Click-me");
        b.setTextFill(Color.BROWN);
        b.setBackground(Background.fill(Color.PINK));
        b.setCursor(Cursor.CLOSED_HAND);
        b.setStyle("-fx-border-color-yellow;");
        Alert a = new Alert(Alert.AlertType.CONFIRMATION,"Button is clicked");
        b.setOnAction(e->a.show());
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();
    }
   public static void main() {
    launch();
    }
}
