// using range until sqrt(number)

class PerfectNumber5{
    public static void main(String []a){
        int num = 6;

        if(getDivisorsSum(num) == num)
            System.out.println(num + " is a perfect number");
        else 
            System.out.println(num + " is not a perfect number"); 
    }

    static int getDivisorsSum(int n){
        int sum = 0;

        for( int i=1; i<Math.sqrt(n); i++){

            if(n%i == 0){
                // For n : (1, n) will always be pair of divisor
                // acc to def., we must ignore adding num itself as divisor
                // when calculating for perfect number
                if(i == 1)
                    sum += i;
                // Example For 100 (10,10)  will be one pair
                // But, we should add value to the sum just once
                else if(i == n/i)
                    sum += i;
                // add both pairs as divisors
                // For any divisor i, n/i will also be a divisor
                else
                    sum = sum + i + n/i;
            }

        }

        return sum;
    }
}