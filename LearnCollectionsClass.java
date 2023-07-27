import java.util.*;
import java.util.Collections;
public class LearnCollectionsClass {
   public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();

    al.add(40);
    al.add(50);
    al.add(30);
    al.add(80);
    al.add(40);

    System.out.println(al);

    System.out.println("Minimum element is: "+Collections.min(al));//Minimum element is: 30
    System.out.println("Maximum element is: "+Collections.max(al));//Maximum element is: 80

    //Finding frequency of any element
    
    System.out.println(Collections.frequency(al, 40));//2

    //Sorting our list

    Collections.sort(al);
    System.out.println(al);//[30, 40, 40, 50, 80]

    //Sorting our list in reverse order

    Collections.sort(al,Comparator.reverseOrder());
    System.out.println(al);//[80, 50, 40, 40, 30]

   }

  
    
}
