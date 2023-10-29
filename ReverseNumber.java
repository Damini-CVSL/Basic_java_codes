// using while loop

class ReverseNumber{
    public static void main(String []a){
        int num = 1234 , reverse=0, remainder;

        while(num!=0){
            remainder = num%10;
            reverse = reverse*10 + remainder;
            num = num/10;
        }
        System.out.println("Reverse of given number is " +reverse);
    }
}