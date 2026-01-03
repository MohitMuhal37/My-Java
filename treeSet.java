import java.util.List;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(12, 54, 6, 7));
        ts.headSet(1,true);
        ts.add(64);
        System.out.println(ts);
    }
}
