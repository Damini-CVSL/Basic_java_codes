import java.util.Scanner;
public class SumOfnumbersInString{
    public static void main(String []a){
        Scanner sc =new Scanner(System.in);
        String str = "dsw456789mnxser56";
        int sum =0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                sum = sum + Character.getNumericValue(str.charAt(i));
        }
        System.out.println("Sum of all digit present in a string is : "+sum);
    }
}