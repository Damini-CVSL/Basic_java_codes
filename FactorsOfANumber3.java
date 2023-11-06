// for negative numbers

class FactorsOfANumber3{
    public static void main(String[] a){
        int num = -100;
        getFactorial(num);
    }

    static void getFactorial(int num){

        for(int i=num; i<=Math.abs(num); i++){

            // skip 0 as iteration
            if(i == 0)
                continue;

            else{
                if(num%i == 0)
                    System.out.print(i+ ", ");
            }
        }
    }
}