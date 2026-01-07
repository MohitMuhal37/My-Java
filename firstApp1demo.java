import java.awt.*;

public class firstApp1demo extends Frame {
    
    Label l;
    TextField tf;
    Button b;

    firstApp1demo()
    {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Enter");

        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) {
        firstApp1demo mf = new firstApp1demo();
        mf.setSize(300,300);
        mf.setVisible(true);
    }
}
