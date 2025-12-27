class outer1{
    public void display()
    {
        class Inner
        {
            public void inerDisplay()
                {
                System.out.println("Hello i am Inner Class");
                }
        }
         new Inner().inerDisplay();
    }
}

public class localInner {
    public static void main(String[] args) {
    outer1 o = new outer1();
    o.display();
    }
}
