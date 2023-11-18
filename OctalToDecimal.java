import java.util.Scanner;
public class OctalToDecimal{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        int temp;
        int decimal = 0, i=0;

        while(octal != 0){
            temp = octal % 10;
            decimal += (int)temp*Math.pow(8,i);
            octal /= 10;
            i++;
        }
        System.out.println("Decimal Number : "+decimal);
    }
}