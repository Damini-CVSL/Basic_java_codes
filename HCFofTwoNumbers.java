//method 1: Linear Quest
import java.util.Scanner;
class HCFofTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//60
        int b = sc.nextInt(); //50
        int hcf=0;

        for(int i=1; i<=a || i<=b; i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("GCD of given two numbers is " +hcf);
    }
}