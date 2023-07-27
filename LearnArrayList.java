
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
public class LearnArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Adding elements in ArrayList

        list.add(100);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.add(50); // This will add 50 at the end of the arraylist.
        System.out.println(list);

        // Adding element at any index

        list.add(2,25); // This will add 25 at index 2.
        System.out.println(list);

        // Adding new ArrayList in our existing ArrayList
        //First create a new arraylist

        ArrayList<Integer> newList = new ArrayList<Integer>();

        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);// [100,20,25,30,40,50,150,160]

        // Getting the element

        System.out.println(list.get(3)); // 30

        // Remove any element by giving index

        list.remove(6); // this will remove 150
        System.out.println(list); // [100,20,25,30,40,50,160]

        // Remove any element by giving Integer value

        list.remove(Integer.valueOf(30)); // 30 will remove
        System.out.println(list); // [100,20,25,40,50,160]

        // Change any element ie override

        list.set(2,22); // It will replace 2nd index element ie 25 by 22
        System.out.println(list); // [100,20,22,40,50,160]

        // Checking the given element present in arraylist or not

        System.out.println(list.contains(40));  //true

        // Finding arraylist size

        System.out.println(list.size());// 6

        // Printing all elements of ArrayList Using loop

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        // Printing all elements of ArrayList Using for each loop

        for(Integer element: list){
            System.out.print("\n"+element+" ");
        }

        System.out.println();
        
        // Printing all elements of ArrayList Using Iterator

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Sorting the ArrayList

        Collections.sort(list);
         System.out.println(list);

         // Removing all elements from the ArrayList
       
         list.clear();
         System.out.println(list);//[]


        




    }
}