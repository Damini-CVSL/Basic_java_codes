// check the alphabet using ASCII values of character

public class CharacterIsAlphabetOrNot1{
    public static void main(String[] a){
        char c = 'r';
        
        if((c >= 97 && c<= 122) || (c >= 65 && c<= 90))
            System.out.println("Given input " +c+ " is an Alphabet");
        else
            System.out.println("Given input " +c+ " is not an Alphabet");
    }
}