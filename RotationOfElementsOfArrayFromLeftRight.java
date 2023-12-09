public class RotationOfElementsOfArrayFromLeftRight{
    public static void main(String[] a){
        int arr[] = { 10, 20, 30, 40, 50, 60, 70};
        int len = arr.length;

        leftRotate(arr,3,len);
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    static void leftRotate(int arr[], int r,int n){
        for(int i=0; i<r; i++){
            leftRotateByOne(arr,n);
        }
    }

    static void leftRotateByOne(int arr[], int n){
        int temp = arr[0];
        for(int i=0; i<n-1; i++)
            arr[i] = arr[i+1];
        arr[n-1] = temp;
            
    }
}