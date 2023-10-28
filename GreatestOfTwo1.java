// using ternery operator

class GreatestOfTwo1{
    public static void main(String[] args){
        int number1 = 88;
        int number2 = 88;

        if(number1 == number2){
            System.out.println("The given two numbers are equal");
        }

        else{
            int result = number1 > number2 ? +number1  : +number2 ;
            System.out.println(result);
        }
    }
}