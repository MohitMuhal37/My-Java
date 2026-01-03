import java.util.ArrayDeque;
import java.util.Iterator;

public class arrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offer(23);
        dq.offer(43);
        dq.offer(223);
        dq.offerFirst(109);
        dq.offerLast(24);

        Iterator<Integer> iq = dq.iterator();
        while (iq.hasNext()) {
            System.out.println(iq.next());
        }
    }
}
