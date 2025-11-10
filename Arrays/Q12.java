 //repeating element
 import java.util.*;
public class Q12 {
    public static void main(String[] args) {
     int[] arr = {4, 5, 9, 4, 9, 6, 5};
      Set<Integer>seen=new HashSet<>();
        Set<Integer>duplicate=new HashSet<>();
        for(int i:arr){
            if(!seen.add(i)){
                duplicate.add(i);
            }
        }
        System.out.println(duplicate.size());
    
    
}}
