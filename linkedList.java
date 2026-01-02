import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class linkedList {
    public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<>();
    LinkedList<String> ll1 = new LinkedList<>(List.of("Max","Happy","Ganesh","Govardhan"));
    ll.add("Mat");
    ll.add("John");
    ll.add("Steve");
    ll.add("Carlos");
    ll.add("Chadwick");
    ll.addLast("Tchala");
    ll.addFirst("Maniac");
   System.out.println("At index 3 is = "+ll.get(3));

    Iterator<String> s = ll.iterator();
    while(s.hasNext()){
        System.out.println(s.next());
    }
    }
}
