//merger two sorted  array
import java.util.*;;
public class Q7 {
    public static void main(String[] args) {
        
    
    int[] a = {1, 3, 5, 9};
        int[] b = {2, 4, 6, 8, 10};
int merged[]=new int[a.length+b.length];
int i=0,j=0,k=0;
while(i<a.length &&j<b.length)
{
   if (a[i]<=b[j]) {
    merged[k]=a[i];
    i++;
    k++;
   }else{
    merged[k]=b[j];
    k++;
    j++;
   }
}
while (i<a.length) {
    merged[k++]=a[i++];
}
while (j<b.length) {
    merged[k++]=b[j++];
}
 System.out.println(Arrays.toString(merged));
}
}
