// using for loop

class ReverseNumber1{
    public static void ain(String[] a){

        int num = 569, rem, reverse=0;

        for(num=569; num!=0; num=num/10){
            rem = num%10;
            reverse = reverse*10 + rem;
            
        }

        System.out.println("Reverse of a given number " +reverse);
    }
}