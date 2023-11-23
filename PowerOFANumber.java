// using loop 
import java.util.Scanner;
public class PowerOFANumber{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int expo = sc.nextInt();
        int base = sc.nextInt();
        System.out.println("Power of a given number is " + getPower(base,expo));
    }

    static int getPower(int base, int expo){
        if(expo == 0)
            return 1;
        return (base * getPower(base , expo-1));
    }
}