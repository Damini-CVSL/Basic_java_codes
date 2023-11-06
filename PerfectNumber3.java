// using range until number/2 and a function

class PerfectNumber3{
    public static void main(String []a){

        int num = 12;

        if(isPerfect(num))
            System.out.println(num + " is a perfect number");
        else 
            System.out.println(num + " is not a perfect number");   
    }

    static boolean isPerfect(int num){
        int sum = 0, i;

        for(i=1; i<=num/2; i++){
            if(num%i == 0)
                sum += i;
        }

        return (sum == num);

    }
}