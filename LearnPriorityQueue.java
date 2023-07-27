import java.util.*;
import java.util.PriorityQueue;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(48);

        System.out.println(pq); //[12, 24, 36, 48]

        // poll() method remove the element which had come first and return that element

         System.out.println( pq.poll());// 12
         System.out.println(pq); //[24, 36, 48]
         
        // peek() method return the next element

         System.out.println(pq.peek());//24
    }
    
   
}
    

