import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt(); 
        int decimal = 0;
        int i = 0;

        while(binary!=0){
            int temp = binary%10;
            decimal += (int)temp*Math.pow(2, i);
            binary /= 10;
            i++;
        }
        System.out.println("Decimal number : "+decimal);
    }
}
 