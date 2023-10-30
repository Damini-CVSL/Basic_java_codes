// using recursion
import java.util.*;
import java.lang.*;

class ArmstrongNumber1{
    public static void main(String[] a){

        int num = 1634;
        int len = order(num);

        if(num == getArmstrongSum(num, len)){
            System.out.println(num + " is Armstrong");
        }
        else{
            System.out.println(num + " is not an Armstrong");
        }
    }

    private static int getArmstrongSum(int num, int order){
        if (num == 0)
            return 0;

        int digit = num % 10;

        return (int) Math.pow(digit, order) + getArmstrongSum(num/10, order);
    }

        static int order(int num){
        int len = 0;
        while(num != 0){
            len++;
            num = num/10;
        };
        return len;
    }

}