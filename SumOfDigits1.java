// Recurssion methon 
import java.util.Scanner;
class SumOfDigits1{
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        System.out.println("Sum of Digits of a Number is " + getSum(num,sum));
    }

    static int getSum(int num, int sum){

        if (num == 0)
            return sum;

        sum = sum + num%10;
            return getSum(num = num/10,sum);
    }
}