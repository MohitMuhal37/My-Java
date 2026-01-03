import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(120);
        hs.add(90);
        hs.add(1);
        hs.add(170);

        hs.forEach((x)->System.out.print(x+" "));
     }
}
