import javax.swing.plaf.BorderUIResource;
import java.awt.*;

class FlowOut extends Frame
{
    Button b,b1,b2,b3,b4,b5;
    public FlowOut()
    {
    super("Flow Layout");
    setLayout(new GridLayout(3,2));
    b = new Button("One");
    b1 = new Button("Two");
    b2 = new Button("Three");
    b3 = new Button("Four");
    b4 = new Button("Five");
    b5 = new Button("Six");
//
//    FlowLayout f = new FlowLayout();
//    f.setAlignment(FlowLayout.RIGHT);
//    f.setHgap(50);
//
//    setLayout(f);

    add(b,BorderLayout.NORTH);
    add(b1,BorderLayout.EAST);
    add(b2,BorderLayout.SOUTH);
    add(b3,BorderLayout.WEST);
    add(b4, BorderLayout.CENTER);
//    add(b5);
    }
}

public class flowLayout {
    public static void main() {
        FlowOut fl = new FlowOut();
        fl.setSize(400,400);
        fl.setVisible(true);
    }
}
