import java.util.Scanner;

public class LCMofTwoNumbers{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//
        int n2 = sc.nextInt();

        int lcm = (n1 > n2)? n1 : n2;

        while(true){
            if(lcm%n1 == 0 && lcm%n2 == 0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
        
    
    }
}