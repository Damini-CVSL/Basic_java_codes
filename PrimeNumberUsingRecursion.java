import java.util.Scanner;
public class PrimeNumberUsingRecursion{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Given number is a Prime number");
        }
        else{
            System.out.println("Given number is not a Prime number");
        }
    }
    static boolean isPrime(int n){
        int count = 0;
        if(n<2)
            return false;

        for(int i=1; i<=n; i++){
            if(n % i == 0)
                count++;
        }

        if(count > 2)
            return false;
        else
            return true;
    }
}