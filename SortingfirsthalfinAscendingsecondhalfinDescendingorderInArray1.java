import java.util.*;
public class SortingfirsthalfinAscendingsecondhalfinDescendingorderInArray1{
    public static void main(String[] a){
        int[] arr = {2,3,6,10,9,8,25,16,9,4};
        int len = arr.length;
        printOrder(arr,len);
    }

    static void printOrder(int[] arr, int len){

        Arrays.sort(arr);

        for(int i=0; i<len/2; i++){

            System.out.print(arr[i] + " ");

        }
        for(int j=len-1; j>=len/2; j--){

            System.out.print(arr[j] + " ");
            
        }
    }
}