import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class jtext extends JFrame
{
    jtext()
    {
        JTextField jf = new JTextField(15);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField jft = new JFormattedTextField(df);
        jft.setColumns(15);
        jft.setValue(new Date());
        setLayout(new FlowLayout());
        add(jf);
        add(jft);
    }
}
public class jtextField {
   public static void main() {
    jtext jt = new jtext();
    jt.setSize(500,500);
    jt.setVisible(true);
    }
}
