class HarshadNumber{
    public static void main(String []a){

        int num = 21, temp, result = 0, pick_last;
        temp = num;

        while(temp != 0){
            pick_last = temp % 10;
            result += pick_last;
            temp /= 10; 
        }

        if(num%result == 0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad number");


    }
}