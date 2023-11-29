import java.util.Scanner;
public class RemovingSpacesFromString1{
    public static void main(String[] a){
        String str = "Damini is the best";
        StringBuffer sb = new StringBuffer();
        String[] str1 = str.split("[\\s]");
        for(String string : str1)
            sb.append(string);
        System.out.println(sb);
    }
    
}