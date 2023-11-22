import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n))){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}