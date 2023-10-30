// using  with toCharArray

class Palindrome4{
    public static void main(String[] a){

        System.out.println(isPalindrome("malayalam".toLowerCase()));
        System.out.println(isPalindrome("Naman".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }

    static boolean isPalindrome(String original){
        
        char[] data = original.toCharArray();

        int i = 0;
        int j = data.length-1;

        while(j>1){

            if(data[i] != data[j])
                return false;

            ++i;
            --j;
        };

        return true;
    }
}