import java.util.Scanner;

public class BasicRightTriangleNumberPattern{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}