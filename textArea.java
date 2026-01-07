import java.awt.*;
import java.awt.event.*;
class textAreas extends Frame implements ActionListener
{
    Label l;
    TextArea ta;
    TextField tf;
    Button b;

    textAreas()
    {
        super("TextArea");
        l = new Label("             ");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");
        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
    ta.append(tf.getText());
    }
}

public class textArea {
    public static void main() {
        textAreas ts = new textAreas();
        ts.setSize(400,400);
        ts.setVisible(true);
    }
}
