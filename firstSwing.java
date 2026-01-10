import javax.swing.*;
import java.awt.*;

class FirstSwings extends JFrame
{
    JLabel l;
    JButton b;
    int count = 0;
    FirstSwings()
    {
        super("FirstSwing");
        l = new JLabel("Clicked "+count+" Times");
        b = new JButton("Clicked");
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
}

public class firstSwing {
   public static void main() {
    FirstSwings fs = new FirstSwings();
    fs.setSize(500,500);
    fs.setVisible(true);
    fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
