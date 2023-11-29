// using charAt() method 
import java.util.Scanner;
public class ReverseTheString1{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reverse = "";
        
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Given string : " +str);
        System.out.println("Reversed string : " +reverse);
    }
}