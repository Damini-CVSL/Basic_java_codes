//using recursion
public class FindLargestAndSmallestElementInArray1{
    public static void main(String[] a){
        int []arr = {5,2,45,52,452,47,6,1};
        int arrlen = arr.length;
        System.out.println("Smallest Element : "+getmin(arr,arrlen));
        System.out.println("Largest Element : "+getmax(arr,arrlen));
    }

    static int getmin(int arr[], int arrlen){
        if(arrlen == 1)
            return arr[0];
        
        return Math.min(arr[arrlen-1], getmin(arr,arrlen-1));
    }

    static int getmax(int arr[], int arrlen){
        if(arrlen == 1)
            return arr[0];
        
        return Math.max(arr[arrlen-1], getmax(arr,arrlen-1));
    }
}