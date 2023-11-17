import java.util.Scanner;
public class MirrorredRhombusPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=row; j>i; j--)
                System.out.print(" ");
            for(int j=0; j<col; j++)
                System.out.print("*");
            System.out.println();
            
        }
    }
}