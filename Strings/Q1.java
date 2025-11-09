//Palindrome Check (Ignoring Spaces & Symbols)
import java.util.*;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=  sc.nextLine();
        String cleaned =str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev= new StringBuilder(cleaned).reverse().toString();
        sc.close();
        if (cleaned.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}