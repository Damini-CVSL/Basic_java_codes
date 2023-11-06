// method 1
import java.io.*;
import java.lang.Math;

class PrimeFactorOfANumber{
    public static void main(String[] a){
        int n = 90;
        primeFactor(n);
    }

    static void primeFactor(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)==1){
                int x = n;
                while(x%i==0){
                    System.out.print(i+ " ");
                    x /= i;
                }
            }

        }
        
    }

    static int isPrime(int n){
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0)
                return 0;

            
        }

        return 1;
    }
}