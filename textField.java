import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MFrame extends Frame implements TextListener, ActionListener
{
    Label l,l1;
    TextField tf;

    MFrame(){
        super("TextField Demo");
        l = new Label("No text enter yet");
        l1 = new Label("Enter key is not hit yet");
        tf = new TextField(20);
        tf.setEchoChar('*');
        tf.addTextListener(this);
        tf.addActionListener(this);
        setLayout((new FlowLayout()));

        add(l);
        add(l1);
        add(tf);


    }

    public void textValueChanged(TextEvent e) {
    l.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent e) {
    l1.setText(l1.getText());
    }
}

public class textField {
   public static void main() {
    MFrame mf = new MFrame();
    mf.setSize(400,400);
    mf.setVisible(true);
    }
}
