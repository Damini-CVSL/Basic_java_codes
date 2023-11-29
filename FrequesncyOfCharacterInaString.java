import java.util.Scanner;
public class FrequesncyOfCharacterInaString{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[str.length()];

        char[] charr = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            freq[i] = 1;
            for(int j=i+1; j<str.length(); j++){
                if(charr[i] == charr[j]){
                    freq[i]++;
                
                    charr[j] = '0';
                }
            }
        }

            System.out.println("Characters and their corresponding frequencies");
            for(int k=0; k<freq.length; k++){
                if(freq[k]>0){
                    System.out.println(charr[k]+  " - " +freq[k]);
                }
            }

        
    }
}