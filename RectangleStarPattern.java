import java.util.Scanner;

public class RectangleStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++)
                System.out.print("*");
           System.out.println(); 
        }
        
    }
}