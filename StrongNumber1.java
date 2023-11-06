// using recurssive function

class StrongNumber1{
    public static void main(String[] a){
        int num = 145;

        if(dectectStrong(num))
            System.out.println(num+ " is Strong Number");
        else    System.out.println(num+ " is not a Strong Numbe");

    }

    static boolean dectectStrong(int num){
        int sum = 0, temp, digit;
        boolean flag = false;
        temp = num;

        while(temp != 0){
            digit = temp%10;
            sum += factorial(digit);
            temp /= 10;
        }

        if(sum == num)
            flag = true;
        else
            flag = false;
        return flag;
    }

    static int factorial(int num){
        if(num == 0)
            return 1;
        
        return num * factorial(num-1);
    }
}