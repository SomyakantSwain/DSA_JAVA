// find pairs  sum to the target value
import java.util.*;;
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;
        HashSet<Integer> set= new HashSet<>();
        for(int i:arr){
            int complement=target-i;
            if (set.contains(complement)) {
                System.out.println("(" + i + ", " + complement + ")");
            }
            set.add(i);
        }

    }
}
