import java.util.Scanner;

public class BasicSquare1Pattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
                System.out.print("1");
            System.out.println();
        }
    }
}