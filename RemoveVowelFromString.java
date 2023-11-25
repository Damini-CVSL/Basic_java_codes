import java.util.Scanner;
public class RemoveVowelFromString{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String str1 = "";

        str1 = str.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel is : " +str1);
    }
}