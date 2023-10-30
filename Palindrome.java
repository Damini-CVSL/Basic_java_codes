// using iteration

class Palindrome {
    public static void main(String[] a){
        int number = 151, temp;
        int reverse = 0, reminder;
        temp = number;

        while(temp != 0){
            reminder = temp%10;
            reverse = reverse *10 + reminder;
            temp = temp/10;
        }

        if (reverse == number){
            System.out.println(number+ " is Palindrome");
        }
        else{
            System.out.println("Given number " + number + " is not Palindrome");
        }
    }
}