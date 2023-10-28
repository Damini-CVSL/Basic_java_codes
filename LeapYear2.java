// using ternary Operator
import java.util.Scanner;
class  LeapYear2{
    public static void main(String[] a){
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();

        int flag = (year%400 == 0) || (year%4 == 0 &&  year%100 != 0)? 1 : 0;

        if (flag ==1)
            System.out.println("Leap Year");

        else
            System.out.println("Not a Leap Year");
    }
}