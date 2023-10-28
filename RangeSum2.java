// using Recursion

class RangeSum2{
    public static void main(String[] args){

        int a = 5;
        int b = 10;

        int sum = getSum(0, a, b);
            System.out.println("The sum is " +sum);
    }

    static int getSum(int sum, int i, int j){
        //stops when any recursion call tries to go over j(larger number)
        if(i > j)
            return i;

        return i + getSum(sum, i+1, j);
    }
}