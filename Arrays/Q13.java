 import java.util.*;
public class Q13 {
    public static void main(String[] args) {
     int[] arr = {4, 5, 9, 4, 9, 6, 5};
       for (int i = 0; i < arr.length; i++) {
           boolean isUnique=true;
         for (int j = 0; j < arr.length; j++) {
            if(i!=j&&arr[i]==arr[j]){
                isUnique=false;
                break;
            }
         }
         if (isUnique) {
            
             System.out.println(arr[i]);
         }
       }
    }}