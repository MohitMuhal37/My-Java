abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class circle2 extends Shape{
    double radius;
    circle2(int r){
        this.radius = r;
    }
    public double area(){
       double a = Math.PI * radius * radius;
       return a;
    }

    public double perimeter(){
        double p = 2 * Math.PI * radius;
        return p;
    }
}

public class abstractExample1 {
    public static void main(String[] args) {

    }
}
