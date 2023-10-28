// using if-else statements

import java.util.Scanner;
class LeapYear{
    public static void main(String[] a){
        Scanner sc  = new Scanner(System.in);
        int year = sc.nextInt();

        if (year%400 == 0)
            System.out.println("Leap Year");

        else if (year%4 == 0 && year%100 != 0)
            System.out.println("Leap Year");
        
        else
            System.out.println("The given year is not a Leap Year");
    }
}