import java.util.Scanner;
public class BinaryToOctal{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter binary Value");
        int binary = sc.nextInt();
        int temp, decimal = 0, n=0;

        while(binary != 0){
            temp = binary % 10;
            decimal +=  temp*(int)Math.pow(2,n);
            binary /= 10;
            n++;
        }
        System.out.println("Decimal Value is : " +decimal);
        int octal[] = new int[20];
        int r, i = 0;
        while(decimal > 0){
            r = decimal % 8;
            octal[i++] = r;
            decimal /= 8;
        }
        System.out.println("Octal number is : ");
        for(int j=i-1; j>=0; j--)
            System.out.print(octal[j]+"");
        sc.close();
    }
}