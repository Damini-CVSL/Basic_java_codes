public class SumOfnumbersInString1{
    public static void main(String []a){
        String str = "4PREP2INSTAA6";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sum += (str.charAt(i)-'0');
            }
        }
        System.out.println("Sum of all the digits in a given string is : " +sum);

    }
}