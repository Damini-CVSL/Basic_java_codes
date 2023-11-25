public class ConsonentOrVowelCharacter2{
    public static void main(String[] a){
        char c = 'e';

        if(isvowel(c)){
            System.out.println(c+ " is a Vowel");
        }
        else{
            System.out.println(c+ " is a Consonant");
        }
    }

    static boolean isvowel(char c){

        c = Character.toUpperCase(c);

        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}