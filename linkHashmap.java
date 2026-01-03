import java.util.LinkedHashMap;
import java.util.Iterator;

public class linkHashmap{
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>(5,.75f,true){
            
        };
        lh.put(0,"1");
        lh.put(1,"2");
        lh.put(2,"3");
        lh.put(3,"5");
        lh.put(4,"5");
        lh.put(5,"5");
        lh.get(1);
        lh.get(2);
        lh.get(4);
        lh.forEach((k,v)->System.out.println(k+" "+v));
    }
}