public class Q3 {
    public static void main(String[] args) {
         boolean isPrime =true;
         int num=7;
         if (num<=1) {
            isPrime=false;
         }
         for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0){
                isPrime=false;
                break;
            }
         }
         if (isPrime) {
            System.err.println("PRIME");
         } else {
            System.out.println("not a prime");
         }
         
    }
}
