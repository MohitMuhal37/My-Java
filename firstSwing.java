import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FirstSwings extends JFrame implements ActionListener
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
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText("Clicked "+count+ " Times");
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
