//using recurssion
public class SmallestElementInArray1{
    public static void main(String[] a){
         int[] arr = {5,2,6,4,5,52,65};
         int arrlen = arr.length;
         System.out.println("Smallest element in an  array : "+SmallestElement(arr,arrlen));
    }

    static int SmallestElement(int arr[], int arrlen){
        if(arrlen == 1)
            return arr[0];

        
        return Math.min(arr[arrlen-1], SmallestElement(arr, arrlen-1));
    }
}