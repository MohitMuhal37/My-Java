import java.awt.*;

class CardLayouts extends Frame
{
    Button b1, b2, b3;

    TextField t1, t2, t3;

    Panel p1;
    Panel p2;
    Panel cp;

    Panel mainp;

    Checkbox c1,c2;
    CardLayouts()
    {
        super("Cards Layouts");

        CheckboxGroup cgp = new CheckboxGroup();
        c1 = new Checkbox("One",cgp,true);
        c2 = new Checkbox("Two",cgp,false);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainp = new Panel();
        mainp.setLayout(new CardLayout());


    }
}

public class cardLayout {
    public static void main(String[] args){

    }
}
