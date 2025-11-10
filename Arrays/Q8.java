import java.util.*;
public class Q8{
 public static void main(String[] args) {
    int arr[]={1,2,5,6};
    int l=arr.length;
    int n=arr[l-1];
    Set<Integer>set=new HashSet<>();
    for (int i : arr) {
       set.add(i); 
    }
    for (int j =1;j<=n;j++) {
        if (!set.contains(j)) {
            System.out.println(j);
        }
    }
 }}