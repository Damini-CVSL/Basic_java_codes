import java.util.Arrays;
public class MaxScalarProductOfTwoVectors1{
    public static void main(String[] a){
        int arr1[] = {1, 2, 6, 3, 7};
        int arr2[] = {10, 7, 45, 3, 7};

        int n1 = arr1.length;
        int n2 = arr2.length;

        if(n1 != n2)
            System.out.println("Product cannot be calculated ");
        else{

            Arrays.sort(arr1);
            Arrays.sort(arr2);
        }
        int product = 0;
        for(int i=0; i<n1; i++){
            product += arr1[i]*arr2[i];
        }
        System.out.println("maximum scalar product of two vectors in an array is : "+product);
    }
}