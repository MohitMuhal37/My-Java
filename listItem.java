import java.awt.*;
import java.awt.event.*;
class listItems extends Frame implements ItemListener,ActionListener
{
    List l;
    TextArea ta;
    Choice c;
    listItems(){
        super("My List Item");
        l = new List(4,true);
        ta = new TextArea(20,20);
        c = new Choice();
        l.addItemListener(this);
        c.addItemListener(this);
        setLayout(new FlowLayout());

        l.add("Sunday");
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");

        add(l);
        add(c);
        add(ta);
    }

    public void itemStateChanged(ItemEvent e) {
    if(e.getSource() == l){
        ta.setText(l.getSelectedItem());
    }else{
        ta.setText(c.getSelectedItem());
    }
    }

    public void actionPerformed(ActionEvent e){
        String list[] = l.getSelectedItems();
        String txt = "";
        for(String x : list)
          txt += x + "\n";
        ta.setText(txt);

}
}

public class listItem {
    public static void main(String[] args){
    listItems li = new listItems();
    li.setSize(400,400);
    li.setVisible(true);

    }
}
