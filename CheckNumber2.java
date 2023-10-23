// using Ternery operator
class CheckNumber2{
    public static void main(String []a){
         int p = 0;
         
         if(p == 0){
            System.out.println("Giver number is zero");
         }
         else{
            String result = p > 0? "The given number is Positive" : "The given number id Negative";
            System.out.println(result);
         }
    }
}