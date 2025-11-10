//  max and min
public class Q2 {
    
    public static void main(String[] args) {
        int []arr={2,6,9,4,5};
        int s=0,end=arr.length-1;
         int max=arr[0],min=arr[0];
        for (int  i : arr) {
            if (i>=max) {
                max=i;

            }
            if(i<=min)
            {
                min=i;
            }
        }
        System.out.println(max+"  "+min);
    }
}
