import java.util.Scanner;
public class OctalToBinary{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal value");
        int octal = sc.nextInt();
        int n =0, decimal = 0;
        while(octal != 0){
            int temp = octal % 10;
            decimal += (int)temp*Math.pow(8,n);
            octal /= 10;
            n++;
        }
        System.out.println("Decimal value is : " +decimal);
        int binary[] = new int[20];
        int r, i=0;

        while(decimal > 0){
            r = decimal % 2;
            binary[i++] = r;
            decimal /= 2;
        }
        System.out.println("binary Value is : ");
        for(int j=i-1; j >=0; j--)
            System.out.print(binary[j]+"");

    }

}