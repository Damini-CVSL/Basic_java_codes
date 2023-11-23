import java.util.Scanner;
public class HCFOfTwoNumbers{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();

        System.out.println("GCD of given two numbers " +gcd(num1, num2));

    }
    static int gcd(int num1, int num2){
        if(num1 == 0)
            return num2;
        
        if(num2 == 0)
            return num1;
        
        if(num1 == num2)
            return num1;

        if(num1 > num2)
            return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }
}