import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.CheckBox;

public class textProp extends Application
{
    Text t;
    RadioButton r1, r2, r3;
    CheckBox c1,c2,c3;
    ChoiceBox <Integer> cp;
    public void start(Stage stage) throws Exception
    {
        t = new Text("Hello world");
        HBox hb = new HBox();
        hb.getChildren().add(t);
        r1 = new RadioButton("Red");
        r2 = new RadioButton("Green");
        r3 = new RadioButton("Blue");
        ToggleGroup td = new ToggleGroup();
        r1.setToggleGroup(td);
        r2.setToggleGroup(td);
        r3.setToggleGroup(td);
        HBox hb1 = new HBox();
        hb1.getChildren().addAll(r1,r2,r3);
        hb1.setSpacing(15);
        hb1.setPadding(new Insets(10,10,10,10));

        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Bold");
        c3 = new CheckBox("Italic");
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(c1,c2,c3);
        hb1.setSpacing(15);
        hb1.setPadding(new Insets(10,10,10,10));

        cp = new ChoiceBox<>();
        cp.getItems().addAll(10,20,30,50);
        VBox vb = new VBox();
        vb.getChildren().addAll(hb,hb1,hb2,cp);

        Scene sc = new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
