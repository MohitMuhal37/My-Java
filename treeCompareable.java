import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = "+x+" y = "+y;
    }

    public int compareTo(Object o){
        Point p = (Point)o;
        if(this.x < p.x){
            return -1;
        }
        else if(this.x > p.x){
            return 1;
        }
        else{
            if(this.y < p.y){
             return -1;
        }
           else if(this.y > p.y){
            return 1;
           }
           else{
            return 0;
           }
     }
  }
}
public class treeCompareable {
    public static void main(String[] args) {
        TreeSet<Point> t = new TreeSet<>();
        t.add(new Point(1, 1));
        t.add(new Point(2, 1));
        t.add(new Point(1, 3));

        System.out.println(t);
    }
}
