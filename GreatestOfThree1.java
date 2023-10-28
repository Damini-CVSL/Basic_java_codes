//using if-else statement 2

// using if-else statement 1

class GreatestOfThree1{
    public static void main(String []arg){
        int num1 = 21, num2 = 22, num3 = 111;

        if((num1 > num2) && (num1 > num3))
            System.out.println(num1 + " is the greatest number");
        
        else if((num2 > num1) && (num2 > num3))
            System.out.println(num2 + " is the greatest number");

        else 
            System.out.println(num3 + " is the greatest number");

    }
}