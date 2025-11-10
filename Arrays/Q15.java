// kth largest element

import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 3, 12, 7};
        int k = 2;
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }
}
