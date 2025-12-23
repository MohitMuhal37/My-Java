class Circle2{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public double parameter(){
     return 2 * Math.PI * radius;
    }
}

class Cylinder extends  Circle2{
    public double height;
    public double volume(){
        return area() * height;
    }
}
public class basicInheritance {
    public static void main(String[] args) {
    Cylinder c = new Cylinder();
    c.radius = 7;
    c.height = 10;

        System.out.println("volume = "+c.volume());
        System.out.print("area = "+c.area());
    }
}
