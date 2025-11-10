//delete a an element

import java.lang.reflect.Array;
import java.util.*;

public class Q4 {
     public static void main(String[] args) {
        int[]arr={1,23,45,6};
        int del=23;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==del) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr=Arrays.copyOf(arr,arr.length-1);
                break;
                
            }
            
        }
        System.out.println(Arrays.toString(arr));
     }
}
