// remove duplicates
import java.util.*;
public class Q8{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=  sc.nextLine();
        sc.close();
        Set <Character>set=new LinkedHashSet<>(); // maintain order
        for(char c:str.toCharArray()){
            set.add(c);
        } 
         StringBuilder res= new StringBuilder();
          for(char c:set){
            res.append(c);
          }
          System.out.println(res);
     }
    }