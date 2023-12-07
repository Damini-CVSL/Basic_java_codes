import java.util.HashSet;
public class Determinethearrayissubsetofanotherarray1{
    public static void main(String[] a){
        int arr1[] = { 11, 10, 13, 21, 30, 70 } ;
        int arr2[] = { 11, 30, 70, 10 };

        int n1 = arr1.length;
        int n2 = arr2.length;

        if(isSubset(arr1, arr2, n1, n2))
            System.out.println("arr2[] is subset of arr1[] ");
        else 
            System.out.println("arr2[] is not subset of arr1[] ");   
    }

    static boolean isSubset(int arr1[], int arr2[], int n1, int n2){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n1; i++){
            if(!set.contains(arr1[i]))
                set.add(arr1[i]);
        }

        for(int j=0; j<n2; j++){
            if(!set.contains(arr2[j]))
                return false;
        }

        return true;

    }
}