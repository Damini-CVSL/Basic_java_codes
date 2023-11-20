import java.util.Scanner;
public class DecimalToOctal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal value");
        int decimal = sc.nextInt();
        int octal[] = new int[20];
        int r, i=0;

        while(decimal > 0){
            r = decimal % 8;
            octal[i++] = r;
            decimal /= 8;
        }
        System.out.println("Octal number is ");
        for(int j=i-1; j>=0; j--){
            System.out.print(octal[j]+"");
        }
    }
}