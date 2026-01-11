import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.*;
public class textAreaSlider extends Application
{
    TextArea ta;
    Slider sl;
    public void start(Stage stage)
    {
        ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(50);
        sl = new Slider(10,100,10);
        VBox vb = new VBox();
        sl.setMajorTickUnit(5);
        sl.setShowTickLabels(true);
        sl.setShowTickMarks(true);
        sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));
        vb.getChildren().addAll(ta,sl);
        Scene sc = new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
