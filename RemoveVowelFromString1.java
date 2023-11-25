import java.util.Scanner;
public class RemoveVowelFromString1{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        System.out.println("String after removing vowels is " +removeVowel(str1));
    }

    static String removeVowel(String str){

        return str.replaceAll("[aeiouAEIOU]", "");
    }
}