import java.util.*;

public class Main{
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int low = scn.nextInt();
       int high = scn.nextInt();

        for(int n = low ;n <= high ;n++){
            if(isPrime(n)){
                System.out.println(n);
            }     
        }
    }
    static boolean isPrime(int n){
        for(int div = 2 ; div*div <= n ; div++){
            if(n % div == 0){
                return false;
}