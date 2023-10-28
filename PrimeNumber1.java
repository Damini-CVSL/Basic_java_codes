// using Optimization by break condition

class PrimeNumber1{
    public static void main(String []a){

        int pn = 13;
        boolean isPrime = true;

        // 0 and 1 are not prime numbers and also negative numbers are not prime
        if (pn < 2){
            isPrime = false;
        }
        else{
            for (int i=2; i<pn; i++){
                if(pn%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        String result = isPrime ? "Prime number" : "Not a Prime Number";
        System.out.println("The given number " + pn + " is " +result );

    }
}