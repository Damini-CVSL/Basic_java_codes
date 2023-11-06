// using range as [1, number/2]

class FactorsOfANumber1{
    public static void main(String[] args){

        int num = 12;
        getFactorial(num);
    }

    static void getFactorial(int num){

        for (int i=1; i<=(num/2); i++){
            if(num%i == 0){
                System.out.print(i+ ", ");
            }
        }
        System.out.print(num);
    }
}