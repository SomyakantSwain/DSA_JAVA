
// cout+nt vowels and consonants
 import java.util.*;
public class Q3 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=  sc.nextLine().toLowerCase();
        sc.close();
       int vowels=0;
       int consonants=0;
       for (char ch : str.toCharArray()) {
        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch)!=-1) {
                vowels++;
                
            }
            else{
                consonants++;
            }
            
        }
        
       }
       // print the results so the counted values are used
       System.out.println("Vowels: " + vowels);
       System.out.println("Consonants: " + consonants);
     }
}