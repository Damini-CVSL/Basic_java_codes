import java.util.Scanner;
public class NumberOfDigitsInAnInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        
        while(number != 0){
            int digit = number % 10;
            count++;
            number /= 10;
        }
       
        
        System.out.println("Number of digits in a given number is : "+count);
    }
}