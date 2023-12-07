public class MinScalarProductOfTwoVectors{
    public static void main(String[] a){
        int arr1[] = {1, 2, 6, 3, 7};
        int arr2[] = {10, 7, 45, 3, 7};

        int n1 = arr1.length;
        int n2 = arr2.length;

        if(n1 != n2)
            System.out.println("Product cannot be calculated ");
        else{

            // sorting elements in ascending order
            for(int i=0; i<n1; i++ ){
                for(int j=i+1; j<n1; j++){
                    // swaping elements without third variable
                    if(arr1[i] > arr1[j]){
                        arr1[i] = arr1[i] + arr1[j];
                        arr1[j] = arr1[i] - arr1[j];
                        arr1[i] = arr1[i] - arr1[j];
                    }
                }
            }

            // sorting elements in descending order
            for(int i=0; i<n1; i++ ){
                for(int j=i+1; j<n1; j++){
                    // swaping elements without third variable
                    if(arr2[i] < arr2[j]){
                        arr2[i] = arr2[i] + arr2[j];
                        arr2[j] = arr2[i] - arr2[j];
                        arr2[i] = arr2[i] - arr2[j];
                    }
                }
            }
        }
        int product = 0;
        for(int i=0; i<n1; i++){
            product += arr1[i]*arr2[i];
        }
        System.out.println("Minimum scalar product of two vectors in an array is : "+product);
    }
}