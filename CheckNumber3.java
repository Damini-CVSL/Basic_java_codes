// using Scanner method
import java.util.*;
class CheckNumber3{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num > 0){
                System.out.println("Positive");
            }
            else if (num < 0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            
        }
    }
}