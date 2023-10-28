//using formula
// Fomula to calculate sum within the range is: b*(b+1)/2 - a*(a+1)/2 + a 

class RangeSum1{
    public static void main(String a[]){

        int num1 = 5;
        int num2 = 10;

        int sum = num2*(num2+1)/2 - num1*(num1+1)/2 +num1;
        System.out.println("The sum is " + sum);
    }
}