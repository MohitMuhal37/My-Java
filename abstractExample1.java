
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
class rectangle extends Shape{
   double length;
   double breadth;
   rectangle(double l, double b){
       this.length = l;
       this.breadth = b;
   }

   public double area(){
       return  length * breadth;
    }

    public double perimeter(){
       return  2 * (length + breadth);
    }
}
public class abstractExample1 {
    public static void main(String[] args) {
    Shape s1 = new rectangle(12.98, 34.65);
        System.out.println("Rectangle Area is :- "+s1.area());
        System.out.println("Rectangle Perimeter is :- "+s1.perimeter());
    }
}
