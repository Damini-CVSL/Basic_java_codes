//Using ASCII Table 

class SumOfDigits2{
    public static void main(String[] a){
        String num = "56659896563266568965231245";

        System.out.println("Sum of digits " + getSum(num));
    }

    static int getSum(String num){

        int sum = 0;
        // Traverse through the whole string(char array)
        for(int i=0; i<num.length();i++){
            // Ascii value pf numbers start from 48
	        // subtracting 48 will give us value in int
            sum = sum + num.charAt(i) - 48;
        }

        return sum;
    }
}