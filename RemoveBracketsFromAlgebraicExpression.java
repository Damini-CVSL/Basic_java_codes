import java.util.Scanner;
public class RemoveBracketsFromAlgebraicExpression{
    public static void main(String[] a){
        String str = "(a+b)*c";
        String result = str.replaceAll("[{} ()]", "");
        System.out.println("Expression without brackets : "+result);
    }
}

