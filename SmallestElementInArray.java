public class SmallestElementInArray{
    public static void main(String[] a){
        int arr[] = {2,58,42,1,62,4,79,};

        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Smallest element in an array is : "+min);
    }
}