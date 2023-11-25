import java.util.Scanner;
public class PalindromeString{
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String rev =  "";
        for(int i=str.length()-1; i>=0; i--)
            rev = rev + str.charAt(i);
        if(str.equals(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not palindrome");
    }
}