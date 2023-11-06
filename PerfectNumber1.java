// Using range until num -1 (while loop)

class PerfectNumber1{
    public static void main(String []a){

        int num = 6, i= 1, sum = 0;

        while(i < num){
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