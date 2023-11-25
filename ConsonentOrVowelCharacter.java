//method1
import java.util.Scanner;
public class ConsonentOrVowelCharacter{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        char c = 'a';

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            System.out.println(c+ " is a vowel");
        else
            System.out.println(c+ " is a consonant");
    }
}