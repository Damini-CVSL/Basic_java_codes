import java.util.Scanner;

public class RootsOfAQuadraticEquation{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double r1, r2; 
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double d = (b * b) - (4 * a  * c);

        if(d==0){
            System.out.println("Roots are real and equal");
            r1=r2=-b/(2*a);
            System.out.println("Root1 :" +r1);
            System.out.println("Root2 :" +r2);
        }
        else if(d>0){
            System.out.println("Roots are real and distinct");
            r1= (-b + Math.sqrt(d)) /(2 * a);
            r2= (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root1 :" +r1);
            System.out.println("Root2 :" +r2);
        }
        else{
            System.out.println("Roots are distinct and complex");
            double x = -b / 2 * a;
            double y =Math.sqrt(-d) / (2 * a);

            System.out.println("Root1 = "+ x + "+i" + y);
            System.out.println("Root2 = "+ x + "-i" + y);
        }
    }
}