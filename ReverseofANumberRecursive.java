import java.util.Scanner;
import java.util.Scanner;
public class ReverseofANumberRecursive{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n = sc.nextInt();
        System.out.println("Reversed number is " +reverseOfNumber(n,rev));
    }
    static int reverseOfNumber(int n, int rev){
        if(n == 0)
            return rev;
        
        int digit = n % 10;
        rev = rev * 10 + digit;

        return reverseOfNumber(n / 10, rev);
    }
}
