//using recursion
public class FindingLargestInArray{
    public static void main(String[] a){
        int[] arr = {10,30,5,80,45,26,4,7,};

        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("Greatest element in an array : "+max);
    }
}