import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
       PriorityQueue<Integer> p = new PriorityQueue<>();
       p.offer(123);
       p.offer(8); 
       p.offer(18); 
       p.offer(82); 
       p.offer(38); 
       p.offer(68); 

    //    Iterator<Integer> pq = p.iterator();
    //    while(pq.hasNext()){
    //     System.out.print(pq.next()+" ");

        p.forEach((x)->System.out.println(x+" "));
       }
    }

