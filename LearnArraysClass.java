import java.util.*;
import java.util.Arrays;
public class LearnArraysClass {
    public static void main(String[] args) {
        // int arr[] = {2,3,3,4,5,7,9};
        // int i = Arrays.binarySearch(arr, 4);// For binarSearch Array must be in sorted.
        // System.out.println("Element 4 is present at index: "+i);//Element 4 is present at index: 3

        int a[] = {20,45,10,35,60,25};
        Arrays.sort(a);// Basically it uses Quick Sort
        for(int i: a){
            System.out.print(i+" ");//10 20 25 35 45 60 
        }
 

        System.out.println();

        // Filling value say 12 in our array at every index

        Arrays.fill(a,12);
        for(int i: a){
            System.out.print(i+" ");//12 12 12 12 12 12
        }

    }
    
}
