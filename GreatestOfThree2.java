// using ternary operator 

class GreatestOfThree2{
    public static void main(String[] a){
        int n1 = 10, n2 = 55, n3 = 8;
        int temp, result;

        //finding greatest of n1 , n2 and storing it into one variable
        temp = n1 > n2 ? n1 : n2;

        //finding greatest of temp and n3 & storing it into result
        result = temp > n3 ? temp : n3; 

        System.out.println(result+ " is the greatest number");



    }
}