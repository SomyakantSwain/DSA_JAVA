import java.util.*;
public class Q17{
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 12, 7};
        List<Integer>list=new ArrayList<>();
        int n=arr.length;
        int maxFromright=arr[n-1];
        list.add(maxFromright);
        for(int i=n-2;i>0;i--){
            if (arr[i]>maxFromright) {
                maxFromright=arr[i];
                list.add((maxFromright));
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }}