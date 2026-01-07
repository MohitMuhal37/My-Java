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
        
    }
}
