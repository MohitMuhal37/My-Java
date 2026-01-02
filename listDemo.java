import java.util.ArrayList;
import java.util.List;
public class listDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>(List.of(10,34,65,56));
        al.add(4);
        al.add(0,45);
        al.add(3);
        al.add(67);
        al.addAll(1,al1);
        System.out.println(al);
    }
}
