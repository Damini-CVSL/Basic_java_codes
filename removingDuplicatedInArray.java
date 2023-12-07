import java.util.*;
public class removingDuplicatedInArray{
    public static void main(String[] a){
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}