import java.util.Scanner;
public class HollowInvertedTriangleStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                if(i==1 || j==n || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            

        }
    }
}