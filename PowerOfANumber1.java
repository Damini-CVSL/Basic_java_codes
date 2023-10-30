// with while loop

class PowerOfANumber1{
    public static void main(String []args){
        double base = 1.5;
        int exp = 2;
        double result = 1.0;

        while(exp != 0){
            result = result * base;
            exp--;
        }

        System.out.println( "Result is : " +result);
    }
}