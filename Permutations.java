import java.util.Scanner;
public class Permutations{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int r, n, fact1, fact2, per;

        System.out.println("Enter the value of n");
        // n is number of people
        n = sc.nextInt();
        System.out.println("Enter the value of r");
        // r is number of seats
        r = sc.nextInt();

        fact1 = 1;

        for(int i=n; i>1; i--){
            fact1 = fact1 * i; // calculating factorial(n!)
        }

        int number;
        number = n-r;

        fact2 = 1;

        for(int j=number; j>1; j--){
            fact2 = fact2 * j; // calculating factorial ((n-r)!)
        }

        per = fact1/fact2; // calculating nPr

        System.out.println(per+ " ways");
    }
}