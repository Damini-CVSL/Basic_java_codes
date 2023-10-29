// using parseInt method

class SumOfDigits3{
    public static void main(String[] a){
        String num = "9876543219876543219876";

        System.out.println("Sum of Digits " +getSum(num));
    }

    static int getSum(String num){

        int count = 0;

        for(int i=0; i<num.length(); i++){
            count += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return count;
    }
}