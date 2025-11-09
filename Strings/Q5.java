 import java.util.*;
public class Q5{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=  sc.nextLine().toLowerCase();
        sc.close();
        
       Map<Character,Integer>map=new HashMap<>();
       for(char ch: str1.toCharArray()){
        if (Character.isLetter(ch)) {
            map.put(ch,map.getOrDefault(ch,0)+1 ); 
        }
       }
    //    for(Map.Entry<Character,Integer>e:map.entrySet()){
    //     System.out.println(e.getKey()+"  ->  "+e.getValue());
    //    }

    Map<Character,Integer> res=new TreeMap<>(map);
    res.forEach((ch,count)->System.out.println(ch+" ->"+count));
     }
    }
    
