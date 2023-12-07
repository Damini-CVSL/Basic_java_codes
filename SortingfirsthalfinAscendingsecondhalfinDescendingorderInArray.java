public class  SortingfirsthalfinAscendingsecondhalfinDescendingorderInArray{
    public static void main(String []a){
        int arr[] = {3,2,4,1,10,30,40,20};
        int len = arr.length;
        printOrder(arr, len);
    }

    static void printOrder(int arr[], int len){
        int temp;
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len/2; j++ ){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            for(int j=len/2; j<len-1; j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<len-1; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}