// using range as [1, sqrt(number)]

class FactorsOfANumber2{
    public static void main(String[] a){
        int num = 100;
        getFactorial(num);
    }

    static void getFactorial(int num){

        for(int i=1; i<=Math.sqrt(num); i++){

            if(num%i == 0){

                // if both pair of factors are equal then we just print once
                //eample, for 100: (a, b):(10, 10) 10 should be printed just once
                if(i == num/i)
                    System.out.print(i+ ", ");

                else
                    System.out.print(i+ ", " +num/i+ ", ");
            }
        }
    }
}