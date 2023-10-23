//using bitwise operator

class EvenOdd3{
    public static void main(String a[]){
        int num = 20;

        if (isEven(num)) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    static boolean isEven(int num){
        return (num & 1) == 0;
    }
}