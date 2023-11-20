import java.util.Scanner;
public class MaxNoOfHandShakesCombinations
{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int total = num * (num-1)/2;
            System.out.println("For "+ num +" people there will be " +total+" handshakes");
    }
}