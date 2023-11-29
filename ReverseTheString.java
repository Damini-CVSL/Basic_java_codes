//using stringbuilder
import java.util.Scanner;
public class ReverseTheString{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println("String is " +sb);
        sb.reverse();
        System.out.println("Reversed string is " +sb);
    }

}