import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal value");
        int decimal = sc.nextInt();
        int binary[] = new int[20];
        int i= 0, r;

        
        while(decimal > 0){
            r = decimal % 2;
            binary[i++] = r;
            decimal /= 2;
        }
        System.out.println(" Binary number is :");
        for(int j=i-1; j>=0;j--){
            System.out.print(binary[j]+"");
        }
    }
}