import java.util.Scanner;
public class RemoveCharactersInaStringExceptAlphabets{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Given String is : "+str);
        str = str.replaceAll("[^a-zA-Z]","");
        System.out.println("New String is : "+str);
    }
} 