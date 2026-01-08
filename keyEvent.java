import java.awt.*;
import java.awt.event.*;
import java.util.Date;
class keyEvents extends Frame implements KeyListener
{
    Label l, l1, l2, l3;
    keyEvents()
    {
    super("KeyEvents");
        l = new Label("");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");

        setLayout(null);

        l.setBounds(30,10,100,20);
        l1.setBounds(30,40,100,20);
        l2.setBounds(30,70,100,20);
        l3.setBounds(30,100,100,20);

        add(l);
        add(l1);
        add(l2);
        add(l3);
    }
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {
            l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e) {
            l1.setText("Key Released");
            l3.setText(new Date(e.getWhen())+"");
    }
}

public class keyEvent {
    public static void main() {
    keyEvents ks = new keyEvents();
    ks.setSize(400,400);
    ks.setVisible(true);
    }
}
