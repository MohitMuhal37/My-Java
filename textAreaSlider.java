import javafx.application.Application;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;
import javafx.scene.*;
public class textAreaSlider extends Application
{
    TextArea ta;
    Slider sl;
    public void start(Stage stage)
    {
        ta = new TextArea("20");
        sl = new Slider();
        FlowPane fp = new FlowPane(ta);
        Scene sc = new Scene(fp);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
