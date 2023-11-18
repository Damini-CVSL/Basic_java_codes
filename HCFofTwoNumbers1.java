//method2 Repeated Subtratrction
import java.util.Scanner;
public class HCFofTwoNumbers1{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while(num1 != num2){
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        System.out.println("GCD of a given number is "+num1);
    }
}