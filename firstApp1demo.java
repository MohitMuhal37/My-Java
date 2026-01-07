import java.awt.*;
class MyFrame extends Frame
{
    Label l;
    TextField tf;
    Button b;

    MyFrame()
    {
        super("My App");
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Enter");

        add(l);
        add(tf);
        add(b);
    }
}

public class firstApp1demo {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(300,300);
        mf.setVisible(true);
    }
}
