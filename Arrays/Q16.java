import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 12, 7};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                if (arr[i]>arr[j+1]) {
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

