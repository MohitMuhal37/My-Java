
class Circle{
    private int radius;
   private double r1;

    public Circle(int r){
        this.radius = r;
        r1 = Math.PI*r*r;
    }

    public  void show(){
        System.out.print("Area is  = "+r1);
    }
}

public class constructors {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.show();
    }
}
