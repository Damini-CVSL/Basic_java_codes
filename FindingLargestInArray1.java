//using recursion 
public class FindingLargestInArray1{
    public static void main(String[] a){
        int arr[] = {12,63,58,45,6,4,123};
        int n = arr.length;
        System.out.println("largest number in an array is : "+findLarge(arr, n));
    }
    static int findLarge(int arr[], int n){
        if(n==1)
            return arr[0];
        else
            return Math.max(arr[n-1], findLarge(arr,n-1));
    }

}