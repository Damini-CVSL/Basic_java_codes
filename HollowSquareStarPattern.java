import java.util.Scanner;
public class HollowSquareStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();//4

        for(int i=1 ; i<=row ; i++){
            for( int j=1 ; j<=col ; j++)//1
                if((i == 1 || i == col) || (j == 1 || j == col))
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }
    }
}