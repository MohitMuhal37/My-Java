import java.awt.*;
import java.awt.event.*;
class radiobtn extends Frame implements  ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    radiobtn(){
        super("Checkbox Demo");
        l = new Label("Nothing Selected");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C#");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(c1.getState()) {
            str = str + " " + c1.getLabel();
        }
        if(c2.getState()){
            str = str + " "+ c2.getLabel();
        }
         if(c3.getState()){
            str = str + " "+ c3.getLabel();
        }
        l.setText(str);
    }
}

public class radioCheckbutton {
    public static void main(String[]args){
        radiobtn bt = new radiobtn();
        bt.setSize(400,400);
        bt.setVisible(true);
    }
}
