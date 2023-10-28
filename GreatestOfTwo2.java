// using inbuilt max function

import java.util.Scanner;
class GreatestOfTwo2{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 == n2)
            System.out.println("Both are equal");
        
        else
            System.out.println(Math.max(n1,n2)+ " is the greatest number");
        
    }
}