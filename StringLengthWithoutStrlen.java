import java.util.Scanner;
public class StringLengthWithoutStrlen{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = 0;
        for(char c : str.toCharArray())
            length++;
        System.out.println("length of the Given Input String is " +length);
    }
}