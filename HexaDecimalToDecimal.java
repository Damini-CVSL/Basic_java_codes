import java.util.Scanner;
public class HexaDecimalToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexa decimal number");
        String hex = sc.next();
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int l = hex.length();
        int a, sum = 0;
        l = l-1;

        for(int i=0; i<=l; i++){
            char ch = hex.charAt(i);
            a = digits.indexOf(ch);
            sum = sum + (a*((int)Math.pow(16,l)));
            l--;
        }
        System.out.println("Given Hexadecimal is" +hex);
        System.out.println("Decimal Value is " +sum);
        
    }
}