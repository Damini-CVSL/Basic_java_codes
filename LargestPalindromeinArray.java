public class LargestPalindromeinArray{
    public static void main(String[] a){
        int arr[] = {121, 26584, 52525, 252};
        int len = arr.length;
    
        System.out.println("Lagest palindrome in an array is "+largestPalindrome(arr,len));
    }
    
    static int largestPalindrome(int arr[], int len){
        int result = 0;
        for(int i=0; i<len; i++){
            if(arr[i] > result && isPalindrome(arr[i]))
            result = arr[i];
        }
        
        return result;
    }

    static boolean isPalindrome(int x){
        int digit ;
        int reverse = 0;
        int original = x;

        while(x!=0){
            digit = x%10;
            reverse = reverse*10 + digit;
            x = x/10;
        }
        if(original != reverse)
            return false;
        
        return true;
    }
}

