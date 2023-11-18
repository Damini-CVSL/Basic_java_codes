//Repeated Subtraction using Recursion Algorithm
import java.util.Scanner;
public class HCFofTwoNumbers2{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = getHCF(n1, n2);
        System.out.println("GCD of given two numbers is " +hcf);
    }
    static int getHCF(int n1, int n2){
        if(n1 == 0)
            return n2;

        if(n2 == 0)
            return n1;

        if(n1 == n2)
            return n1;
        
        if(n1 > n2)
            return getHCF(n1 - n2, n2);
        
        return getHCF(n1, n2 - n1);
    }
}