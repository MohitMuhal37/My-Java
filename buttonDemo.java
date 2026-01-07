import java.awt.*;
import java.awt.event.*;

class Buttons extends Frame implements ActionListener
{
   Label l;
   Button b;
   int count;
   
   Buttons(){
    super("Button demo");
    l =new Label("    "+count);
    b = new Button("Click me");
    setLayout(new FlowLayout());
    b.addActionListener(this);
    add(l);
    add(b);
   } 

     public void actionPerformed(ActionEvent e)
    {
       count++;
       l.setText("    "+count);
    }
}
public class buttonDemo {
    public static void main(String[] args) {
        Buttons bt = new Buttons();
        bt.setSize(400,400);
        bt.setVisible(true);
    }
}
