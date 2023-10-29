// using recurssion 
class ReverseNumber2{
    public static void main(String[] a){

        int num = 1234;
        
        System.out.println("Reverse of a given number " +getReverse(num));
    }

    static int getReverse(int num){
        int reverse = 0, reminder;

        if(num == 0)
            return reverse;

        reminder = num%10;
        reverse = reverse*10 + reminder;

        return getReverse(num = num/10);
    }
}

