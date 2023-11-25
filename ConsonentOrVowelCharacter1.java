public class ConsonentOrVowelCharacter1{
    public static void main(String[] a){
        char c = 'e';

        if(isLowercasevowel(c) || isUppercaseVowel(c)){
            System.out.println(c+ " is a Vowel");
        }
        else{
            System.out.println(c+ " is a Consonant");
        }
    }

    static boolean isLowercasevowel(char c){
        // return 1 if char matches any of below
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    static boolean isUppercaseVowel(char c){
        // return i if char matches any of below
        return (c == 'A' || c == 'E' || c == 'I' || c == 'E' || c == 'U');
    }
}