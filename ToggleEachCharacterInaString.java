import java.util.Scanner;
public class ToggleEachCharacterInaString{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";

        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
                str1 = str1 + Character.toLowerCase(str.charAt(i));
            else
                str1 = str1 + Character.toUpperCase(str.charAt(i));
        }

        System.out.println("Toggle String is " +str1);

    }
}