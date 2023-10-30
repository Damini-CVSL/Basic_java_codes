// using recurssion

class Palindrome1{
    public static void main(String[] a){
        int number = 12021, reverse = 0;

        if(getReverse(reverse,number) == number ){
            System.out.println("Given number " +number+ " is Palindrome");
        }
        else {
            System.out.println("Given number " +number+ " is not Palindrome");
        }
    }

    static int getReverse(int reverse,int number){
        
       if(number == 0)
        return reverse;

        int rem = number%10;
        reverse = reverse*10 + rem;

        return getReverse(reverse,number = number/10);
    }
}