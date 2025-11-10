//  reverse an array


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int s=0,end=arr.length-1;
        while (s<=end)
         {
        int temp=arr[s];
        arr[s]=arr[end];
        arr[end]=temp;
        s++;
        end--;            
        }
         System.out.println(Arrays.toString(arr));

    }
}