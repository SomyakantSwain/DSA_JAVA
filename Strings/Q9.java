// count words in s string
import java.util.*;
public class Q9{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=  sc.nextLine().trim();
        sc.close();
        String [] words=str.split("\\s+");
        System.out.println(words.length);
     }}