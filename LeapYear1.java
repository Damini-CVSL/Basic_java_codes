// using if-else statement 2
import java.util.Scanner;
class LeapYear1{
    public static void main(String[] a){
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%400 == 0 || (year%4 == 0 &&  year%100 != 0))
            System.out.println("Leap Year");
        
        else
            System.out.print("Not a Leap Year");
    }
}