// using simple iteration solution

class PrimeNumber{
    public static void main(String[] a){
        int pn = 13;
        checkPrime(pn);
    }

    static void checkPrime(int n){
        int count = 0;
        if (n<2){
            System.out.println("Given number " + n +  " is not a Prime Number");
            System.exit(0);
        }

        for (int i=2; i<=n; i++){
            if(n%i == 0)
                count += 1;
        }

        if(count > 2)
            System.out.println("Given number " + n +  " is not a Prime Number");
        else
            System.out.println(n+ " is a Prime Number") ;
    }
}