import java.util.Scanner;
import java.util.Arrays;
public class CheckIfTwoStringsAreAnagramAreNot{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("String1 : "+str1);
        System.out.println("String2 : "+str2);
        if(isAnagrams(str1,str2)){
            System.out.println(str1+ " and " +str2+ " are anagrams");
       }
       else{
        System.out.println(str1+ " and " +str2+ " are not anagrams");
       }
    }
    static boolean isAnagrams(String str1, String str2){
        String s1 = str1.replaceAll("[\\s]","");
        String s2 = str2.replaceAll("[\\s]","");

        if(s1.length() != s2.length()){
            return false;
        }
        else{
            char[] a1 = s1.toLowerCase().toCharArray();
            char[] a2 = s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2))
                return true;
        }
        return false;
    }
}