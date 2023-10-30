// using for loop and charAt()

class Palindrome3{
    public static void main(String[] a){

        System.out.println(isPalindrome("damini".toLowerCase()));
    }

    static boolean isPalindrome(String original){

        String reverse = "";
        int len = original.length();

        for(int i=len-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }

        return original.equals(reverse);
    }
}