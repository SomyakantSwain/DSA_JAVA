import java.util.*;
public class Q6{
 public static void main(String[] args) {
    int arr[]={1,2,2,23,4,56};
    HashMap<Integer,Integer>map=new HashMap<>();
    for (int i : arr) {
        map.put(i,map.getOrDefault(i,0)+1);
    }
    map.forEach((key,value)-> System.out.println(key+"->"+value));
 }}