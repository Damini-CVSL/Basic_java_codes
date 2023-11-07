import java.util.Scanner;
public class RhombusStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0; i<=row; i++){
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            for(int j=1; j<=col; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}