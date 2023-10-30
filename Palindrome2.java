// using stringBuilder

class Palindrome2{
    public static void main(String[] a){
        System.out.println(isPalindrome("madam".toLowerCase()));

        System.out.println(isPalindrome("11211".toLowerCase()));
    }

    static boolean isPalindrome(String string){
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}