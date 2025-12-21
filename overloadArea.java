public class overloadArea {
    static double area(double l, double b){
        double a = l*b;
        return a;
    }

    static double area(double r){
        double a = 3.14*r*r;
        return a;
    }

    public static void main(String args[]){
        System.out.println(area(4.5));
        System.out.print(area(4.5, 8));
    }
}
