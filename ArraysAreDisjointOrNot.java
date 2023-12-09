public class ArraysAreDisjointOrNot{
    public static void main(String[] a){
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {10, 51, 3};


        if(isDisjoint(arr1,arr2))
            System.out.println("Given two arrays are disjoint");
        else
            System.out.println("Given two arrays are not disjoint");
    }

    static boolean isDisjoint(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    return false;
                }
            }
        }

        return true;
    }
}