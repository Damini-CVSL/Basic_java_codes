// in range until num/2

class PerfectNumber2{
    public static void main(String []a){

        int num = 28, i= 1, sum = 0;

        // all divisors of the numbers (excluding the number itself)
        // can be found before num/2
        // note we will need to use '=' sign as for even numbers
        // like 28, half of the number i.e 14 will also be the divisor
        
        while(i <= num/2){
            if(num%i == 0)
                sum += i;
            i++;
        }

        if(sum == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");
    }
}