public class SortElementsInArray{
    public static void main(String[] a){
        int arr[] = new int[] {10,26,35,14,2};
        int temp = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            
        for(int k=0; k<arr.length; k++){
                System.out.print(arr[k] + " ");
        }
    }
}