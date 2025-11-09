// reverse a string
 import java.util.*;
public class Q2 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=  sc.nextLine();
        sc.close();
        // String rev=  new StringBuilder(str).reverse().toString();
        // System.out.println(rev);
        int l=str.length();
        String rev=" ";
        for (int i = l-1; i >=0; i--) {
            rev+=str.charAt(i);

        }
         System.out.println(rev);
     }
}
