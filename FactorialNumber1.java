// using recurssion

class FactorialNumber1{
    public static void main(String[] a){
        int n = 6;
        System.out.println("the Factorial of " +n+  " is " +getFactorial(n)); 
    }

    static int getFactorial(int n){
        
        if (n == 0)
            return 1;

        return n * getFactorial(n-1);
    }
}