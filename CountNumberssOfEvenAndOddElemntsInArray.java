public class CountNumberssOfEvenAndOddElemntsInArray{
    public static void main(String[] a){
        int arr[] = {1, 20, 60, 31, 75, 40, 80};
        int len = arr.length;
        int count_even = 0;
        int count_odd = 0;
        for(int i=0; i<len; i++){
            if(arr[i]%2 == 0 )
                count_even += 1;
            else   
                count_odd += 1;
        }

        System.out.println("Even Elements count : "+ count_even);
        System.out.println("Odd Elements count : "+ count_odd);
    }
}