import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        int []arr={2,4,6,8};
        int gcd=arr[0];
        int lcm=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            gcd=findgcd(gcd, arr[i]);
            lcm=(lcm*arr[i])/findgcd(lcm, arr[i]);
        }
        System.out.println(lcm);
        System.out.println(gcd);
        
    }
     static int findgcd(int a,int b){
        if(b==0){
            return a;
        }
        return findgcd(b, a%b);
     }
}
