import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class windowObj extends Frame implements WindowListener
{
    Label l;

    windowObj()
    {
        super("Window Class");
        l = new Label("Hello ");
        setLayout(new FlowLayout());

        add(l);
        addWindowListener(this);
    }


    public void windowOpened(WindowEvent e) {
        l.setText("Window Open");
    }


    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }


    public void windowClosed(WindowEvent e) {
        l.setText("Window closed");
    }


    public void windowIconified(WindowEvent e) {
            l.setText("Window Iconified");
    }


    public void windowDeiconified(WindowEvent e) {
        l.setText("Windows Deiconified");
    }


    public void windowActivated(WindowEvent e) {
        l.setText("Windows Activated");
    }


    public void windowDeactivated(WindowEvent e) {
        l.setText("Windows Deactivated");
    }
}

public class window {
    public static void main(String[] args){
    windowObj ob = new windowObj();
    ob.setSize(400,400);
    ob.setVisible(true);
    }
}
