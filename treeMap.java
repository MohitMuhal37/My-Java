import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"Mohit",1,"Mat"));
        System.out.println(tm.get(1));
        tm.put(2, "Rohan");
        System.out.println(tm.containsKey(1));
        
    }
}
