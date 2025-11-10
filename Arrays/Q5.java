// remove duplicates 

import java.util.*;
public class Q5 {
 public static void main(String[] args) {
    int arr[]={1,2,2,23,4,56};
    LinkedHashSet <Integer> set=new LinkedHashSet<>();
    for(int i:arr){
        set.add(i);
    }
    int unique[] =new int[set.size()];
    int j=0;
    for(int num:set){
     unique[j++]=num;
}

    
     System.out.println(Arrays.toString(unique));

 }   
}
