import java.util.Scanner;
public class HalfDiamondInvertedStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i; j++)
                System.out.print(" ");
            for(int k=0; k<i; k++)
                System.out.print("*");
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            for(int k=i; k<=n; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}