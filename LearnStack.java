import java.util.*;
import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        // Pushing elements in Stack

        st.push("Cat");
        st.push("Dog");
        st.push("Elephant");
        st.push("Lion");

        System.out.println(st);

        // peek operation ie returning top value of our Stack 

        System.out.println(st.peek()); // Lion

        // pop operation ie delete the top element

        System.out.println(st.pop()); // Lion
        System.out.println(st);

        System.out.println(st.peek()); // Elephant

        
        
    }
}
