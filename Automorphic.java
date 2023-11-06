class Automorphic{
    public static void main(String []a){
        int num = 376;
        if(isAutomorphic(num) == num)
            System.out.println("given number " +num+ " is Automorphic");
        else
            System.out.println("given number " +num+ " is Automorphic");
    }

    static int isAutomorphic(int num){
        int square = num * num;

        while(num != 0){

            // means not automorphic number
            if(num%10 != square%10)
                return 0;

            
            num /= 10;
            square /= 10;

        }

        // if reaches here means automorphic number
        return 1;
    }
}