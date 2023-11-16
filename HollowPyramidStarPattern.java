import java.util.Scanner;

public class HollowPyramidStarPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                if(k == 1 || k == 2*i-1 || i == row){
                    System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}