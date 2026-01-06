import java.awt.*;
public class firstAppdemo {
    public static void main(String[] args) {
      Frame f = new Frame("My App");
      f.setLayout(new FlowLayout());
      
      Label l = new Label("Enter Name");
      TextField tf = new TextField(20);
      Button b = new Button("Enter Ok");

      f.add(l);
      f.add(tf);
      f.add(b);

      f.setSize(400,400);
      f.setVisible(true);
    }
}
