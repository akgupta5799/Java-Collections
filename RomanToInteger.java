import java.util.*;
public class RomanToInteger {

    public static int coverter(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

       for(int i=0;i<s.length();i++){
        if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
            result = result - map.get(s.charAt(i));
        }
        else{
            result = result + map.get(s.charAt(i));
        }
       }

       return result+map.get(s.charAt(s.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman string: ");
        String s = sc.next();

        int ans =  RomanToInteger.coverter(s);
        System.out.println(ans);
    }
}      
       
    

