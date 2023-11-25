public class CharacterIsAlphabetOrNot{
    public static void main(String[] a){
        char c = '6';

        if((c >= 'a' && c <='z')  || (c >= 'A' && c >= 'Z'))
            System.out.println(c+ " is a Alphabet");
        else
            System.out.println(c+ " is not an Alphabet");
    }
}