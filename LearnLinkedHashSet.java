import java.util.*;
import java.util.LinkedHashSet;
public class LearnLinkedHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();

        // Adding elements in HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);//[10, 20, 30, 40] Insertion order is  maintained.
        
        // Duplicate element is ignored in Set (Because Set doesnot contain duplicate)
        set.add(20);
        System.out.println(set);//[10, 20, 30, 40]

        // Removing any element

        set.remove(40);
        System.out.println(set);//[10, 20, 30]

        // Checking the given element is contained in Set

        System.out.println(set.contains(10));//true

        // Checking our Set empty or not

        System.out.println(set.isEmpty());//false

        // Finding the size of Set

        System.out.println(set.size());//3

        // Clearing all elements from Set

        set.clear();
        System.out.println(set);//[]

    }
}


