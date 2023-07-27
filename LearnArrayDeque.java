import java.util.*;
import java.util.ArrayDeque;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        //Adding elements

        ad.offer(20);
        ad.offer(30);
        ad.offer(40);
        ad.offer(50);

        System.out.println(ad);//[20, 30, 40, 50]

        ad.offerFirst(5);
        System.out.println(ad);//[5, 20, 30, 40, 50]

        ad.offerLast(60);
        System.out.println(ad);//[5, 20, 30, 40, 50, 60]
        
        // Returning peek element

        System.out.println(ad.peek());//5
        System.out.println(ad.peekFirst());//5
        System.out.println(ad.peekLast());//60

        // Remove and return 

        System.out.println(ad.poll());//5
        System.out.println(ad);//[20, 30, 40, 50, 60]
        System.out.println(ad.pollFirst());//20
        System.out.println(ad);//[30, 40, 50, 60]
        System.out.println(ad.peekLast());//60
        System.out.println(ad);//[30, 40, 50, 60]
    }
}
