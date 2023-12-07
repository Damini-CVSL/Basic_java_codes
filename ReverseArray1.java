public class ReverseArray1{
    public static void main(String[] a){
        int[] arr = {10,20,30,40,50,60};
        int len = arr.length;

        int start = 0 , end = len-1;
        while(start<end){
            int temp = arr[0];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<len; i++)
            System.out.print(arr[i] + " ");
    }
}