import java.util.Scanner;
public class InvertedHollowPyramidStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            for(int k=n; k>=i; k--){
                if(k==n || i==1 || k==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            
        }
    }
}