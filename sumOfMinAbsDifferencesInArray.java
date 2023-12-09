public class sumOfMinAbsDifferencesInArray{
    public static void main(String[] a){
        int arr[] = {2, 4, 5, 3};
        int len = arr.length;

        System.out.println("Required minimum sum is  : "+sumOfMinAbsDifferences(arr,len));
    }

    static int sumOfMinAbsDifferences(int arr[], int n){
        int result = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += Math.abs(arr[i]-arr[j]);
            }

            result = Math.min(sum,result);
        }

        return result;
    }
}