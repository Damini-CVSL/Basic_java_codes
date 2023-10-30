// method1

class FactorialNumber{
    public static void main(String[] a){
        int num = 6;
        System.out.println("Factorial of " +num+ " is " +getFactorial(num));
    }

    static int getFactorial(int num){
        int flag = 1;

        for(int i=2; i<=num; i++){
            flag = flag * i;
        }
        return flag;
    }
}