//sort the array and find smallest and second smallest
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int []arr={2,6,9,4,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("smallest"+" "+arr[0]);
        System.out.println("second smallest"+""+arr[1]);
    }
}
