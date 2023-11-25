import java.util.Scanner;
public class ToggleEachCharacterInaString1{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] str1 = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if(str1[i] >= 'A' && str1[i] <= 'Z')
                str1[i] = (char)(str1[i] + 'a' - 'A');
            else if(str1[i] >= 'a' && str1[i] <= 'z')
                str1[i] = (char)(str1[i] + 'A' - 'a');
        }
        System.out.println("Toggled String is ");
        for(int i=0; i<str.length(); i++){
            System.out.print(str1[i]);
        }
    }
}