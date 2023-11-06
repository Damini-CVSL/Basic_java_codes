// using recurssion

class PerfectNumber4{
    public static void main(String []a){

        int num = 6;

        if(isPerfect(num,1) == num)
            System.out.println(num + " is a Perfect number");
        else 
            System.out.println(num + " is a Perfect number");
    }
    
    static long sum = 0;
    static long isPerfect(long num, int i){
        if(i <= num/2 ){
            if(num%i == 0)
                sum += i;

            i++;

            isPerfect(num , i);
        }
        return sum;
    }
}