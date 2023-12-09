public class FindEquilibriumIndexOfAnArray{
    public static void main(String[] a){
        int arr[] = { 1,2,3,4,5,1,3,2,4 };
        int len = arr.length;

        System.out.println("Equilibrium index of given array is "+equilibriumIndex(arr,len));
    }

    static int equilibriumIndex(int arr[], int n){
        int sum = 0;
        int leftSum = 0;
        for(int i=0; i<n; i++)
            sum += arr[i];

        for(int j=0; j<n; j++){
            sum -= arr[j];

            if(leftSum == sum)
                return j;

            leftSum += arr[j];
            }

        
        return -1;
    }
}