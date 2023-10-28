class PrimeNumber2{
    public static void main(String[] a){
        int lower = 1, upper = 20;

        for(int i=lower;i<=upper;i++){
            if(isPrime(i))
                System.out.println(i);
        }

        
    }

    static boolean isPrime(int n){
            // 0, 1 are not prime
            if(n<2)
                return false;

            // checking the mnumber is divisible between 1 and number n-1
            for(int i=2; i<n; i++){
                if(n%i == 0)
                    return false;
            }

            return true;
        }
}