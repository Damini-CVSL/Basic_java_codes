import java.util.Scanner;
public class findQuadrant{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0)
            System.out.println("Quadrant I");

        else if(x<0 && y>0)
            System.out.println("Quadrant II");
        
        else if(x<0 && y<0)
            System.out.println("Quadrant III");
        
        else if(x>0 && y<0)
            System.out.println("Quadrant IV");
        
        else if(x==0 && y==0)
            System.out.println("Origin");
            
        else if(x!=0 & y==0)
            System.out.println("Y axis");

        else if(x==0 && y!=0)
            System.out.println("x axis");
            
    }
}