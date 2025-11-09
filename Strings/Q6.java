// reverse each word in a string

import java.util.*;
public class Q6{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=  sc.nextLine();
        sc.close();
        String [] words;
        words=str1.split(" ");
        StringBuilder result= new StringBuilder();
        for (String word : words) {
         StringBuilder rev= new StringBuilder(word);
         result.append(rev.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());

        

     }}
        