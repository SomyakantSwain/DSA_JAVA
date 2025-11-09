// count the no of words
import java.util.*;
public class Q10{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=  sc.nextLine().trim();
        sc.close();
        String []words= str.split("\\s+");
        Map<String,Integer>map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s, 0)+1);
        }
       Map <String,Integer>map2=new TreeMap<>(map);
       map2.forEach((w,count)->System.out.println(w+"->"+count));


     }}
