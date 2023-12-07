import java.util.Arrays;
import java.util.Collections;
public class MinScalarProductOfTwoVectors1{
    public static void main(String[] a){
        int arr1[] = {1, 2, 6, 3, 7};
        Integer arr2[] = {10, 7, 45, 3, 7};

        int n1 = arr1.length;
        int n2 = arr2.length;

        
        if(n1 != n2)
            System.out.println("Product cannot be calculated ");
        else{
            //sorting arr1 inascending order
            Arrays.sort(arr1);
            //sorting arr2 in descending order
            Arrays.sort(arr2, Collections.reverseOrder());

            
        }
        int product = 0;
        for(int i=0; i<n1; i++){
            product += arr1[i]*arr2[i];
        }
        System.out.println("Minimum scalar product of two vectors in an array is : "+product);
    }
}