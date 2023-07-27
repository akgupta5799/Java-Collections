import java.util.*;
import java.util.LinkedList;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>(); // Because LinkedList implements Queue interface
        
        // Adding elements in Queue

        que.offer(12);
        que.offer(24);
        que.offer(36);
        que.offer(48);

        System.out.println(que); //[12, 24, 36, 48]

        // poll() method remove the element which had come first and return that element

         System.out.println( que.poll());// 12
         System.out.println(que); //[24, 36, 48]
         
        // peek() method return the next element

         System.out.println(que.peek());//24
    }
    
}
