// using recursion
public class LargestElementInArray{
    static int arr[] = {10, 345, 45, 654, 98};

    static int largest() {
        int i;
        int max = arr[0];
        for(i=1; i<arr.length; i++)
            if(arr[i] > max) max = arr[i];
        return max;
    }

    public static void main(String[] a){
        System.out.println("Largest element in an array is " + largest());
    }
}