// using iteration

class FibonacciSeries{
    public static void main(String[] args){
        int n = 15;
        int a = 0 , b = 1;
        //Printing 0 and 1st term
        System.out.print(a+ " , " +b+ " , ");
        int nextTerm;

        for(int i=2; i<n; i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}