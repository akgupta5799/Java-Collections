import java.util.*;
import java.util.LinkedList;
public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements in LinkedList

        ll.add("Addy");
        ll.add("Yash");
        System.out.println(ll); // [Addy, Yash]
        
        // Adding element at First position

        ll.addFirst("Lama");
        System.out.println(ll); // [Lama, Addy, Yash]

        // Adding element at Last position

        ll.addLast("Prins");
        System.out.println(ll); //[Lama, Addy, Yash, Prins]

        // Adding element at specific index

        ll.add(2,"Samar");
        System.out.println(ll); // [Lama, Addy, Samar, Yash, Prins]

        LinkedList<String> ll2 = new LinkedList<>();

        ll2.add("Saif");
        ll2.add("Jacks");

        // Adding new list ll2 in existing list ll

        ll.addAll(ll2);
        System.out.println(ll); //[Lama, Addy, Samar, Yash, Prins, Saif, Jacks]

        // Removing element

        ll.remove("Samar");
        System.out.println(ll); //[Lama, Addy, Yash, Prins, Saif, Jacks]

        // Removing element by passing index value

        ll.remove(4);
        System.out.println(ll); // [Lama, Addy, Yash, Prins, Jacks]

        // Remove first element

        ll.removeFirst();
        System.out.println(ll);//[Addy, Yash, Prins, Jacks]

        // Remove last element

        ll.removeLast();
        System.out.println(ll);// [Addy, Yash, Prins]

        // Finding the size of list

        System.out.println(ll.size());//3

        // Printing all the LinkedList elements

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");// Addy Yash Prins
        }

        System.out.println();

         // Printing all the LinkedList elements using iterator

         Iterator<String> it = ll.iterator();

         while(it.hasNext()){
             System.out.print(it.next()+" "); //Addy Yash Prins
         }

         System.out.println();

          // Printing our linkedList in Reverse order

          Iterator i = ll.descendingIterator();
         while(i.hasNext()){
            System.out.print(i.next()+" ");//Prins Yash Addy
         }

        // Removing all the elements of list

        // ll.clear();
        // System.out.println(ll);//[]

       

        



        



        
    }
    
}
