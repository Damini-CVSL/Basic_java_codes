// using Boolean Method
import java.util.Scanner;
class LeapYear3{
    public static void main(String[] a){
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap;

        if (year%400 == 0)
            leap = true;
        else if (year%4 == 0 && year%100 == 0)
            leap = true;
        else
            leap = false;

        if (leap)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}