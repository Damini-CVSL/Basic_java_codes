// using stack

import java.util.Stack;

public class Palindrome5{
    public static void main(String[] a){

        System.out.println(isPalindrome("malayalam".toLowerCase()));
    }

    private static boolean isPalindrome(String original){

        char[] data1 = original.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char c: data1){
            stack.push(c);
        }

        char[] data2 = new char[data1.length];
        int len = stack.size();

        for(int i=0; i<len; i++){
            data2[i] = stack.pop();
        }

        var reversed = new String(data2);

        return original.equals(reversed);
    }
}