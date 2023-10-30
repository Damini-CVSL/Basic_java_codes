// without while loop

class PowerOfANumber{
    public static void main(String []a){

        double base = 1.5;
        double exp1 = 2.5;
        double exp2 = -2.5;
        double result1, result2;

        result1 = Math.pow(base, exp1);
        result2 = Math.pow(base, exp2);

        System.out.println(base+ " ^ " +exp1+ " is : "+result1);
        System.out.println(base+ " ^ " +exp2+ " is : "+result2);
    }
    
}