// smart dynamic programming approach

class StrongNumber2{
    static int f[] = new int[10];
    // Finding factorial for number 0 to 9
    // to precompute factorials without needing them to be calculated again and again
    // you can change this 0 to 15 or 0 to 20 for larger values
    // in this case change to long

    static void preComputer(){
        f[0]=f[1]=1;
        for(int i=2; i<10; i++)
            f[i] = f[i-1] *i;
    }

    static boolean checkStrong(int num){
        int sum = 0 ;
        int temp = num;

        while(temp != 0){
            sum += f[temp%10];
            temp /= 10;
        }

        return (sum == num);
    }

    public static void main(String []a){
        // calling preCompute
        // this way we do not need to calculate factorial again and again
        // we can directly use saved up values like dynamic programming
        preComputer();  
        int num = 145;

        if(checkStrong(num))
            System.out.println(num+ " Its a strong number");
        else
            System.out.println(num+ " Its not a strong number");
    }
}