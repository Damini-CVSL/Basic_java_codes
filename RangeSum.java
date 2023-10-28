// using brute force

class RangeSum{
    public static void main(String[] args){

        int a = 12;
        int b = 15;
        int sum = 0;

        for(int i=a; i<=b; i++){
            sum = sum + i;
        }
        System.out.println(" The sum is " + sum);
    }
}