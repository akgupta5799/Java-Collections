import java.util.*;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        // Adding elements in TreeSet
        ts.add(10);
        ts.add(50);
        ts.add(30);
        ts.add(60);
        ts.add(70);

        System.out.println(ts);//[10, 30, 50, 60, 70]

        System.out.println();

        // Traversing elements

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");//10 30 50 60 70
        }

        System.out.println();

        // Traversing elements in reverse order

        Iterator itr = ts.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");// 70 60 50 30 10
        }

        System.out.println();

        // Removing and retrieving the highest and lowest
        
        System.out.println(ts.pollFirst());//10
        System.out.println(ts);//[30, 50, 60, 70]

        System.out.println(ts.pollLast());//70
        System.out.println(ts);//[30, 50, 60]
    }
    
}
