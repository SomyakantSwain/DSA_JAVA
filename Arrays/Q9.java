// rotate k by position
import java.util.*;
public class Q9{
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int s=0;
    int l=arr.length;
    int k=2;
    k=k%l;
    rev(arr,s,k-1);
    rev(arr,k,l-1);
    rev(arr, s, l-1);
System.out.println(Arrays.toString(arr));
 }
static void rev( int arr[],int start,int end){
    while (start<end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
}


}