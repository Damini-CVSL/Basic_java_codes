// using range until num-1 (for loop)

class PerfectNumber{
    public static void main(String []a){
        int num = 6, sum = 0;

        for(int i=1; i<num; i++){
            if(num%i == 0){
                sum += i;
            }
            
            
        }
        if(sum == num)
            System.out.println(num+ " is a perfect  Number");
        else
            System.out.println(num+ " is  not a perfect  Number");
    }
}