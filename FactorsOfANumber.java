// using range as [1, number]

class FactorsOfANumber{
    public static void main(String[] a){
        int num = 12;

        for(int i=1; i<=num; i++){
            if(num % i == 0)
                System.out.print(i+ ", ");

        }
    }
}