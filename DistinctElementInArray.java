import java.util.Arrays;
public class DistinctElementInArray{
    public static void main(String[] a){
        int arr[] = {10, 30, 30, 20, 10, 20, 50, 10};
        int len = arr.length;

        distinctElement(arr, len);
    }

    static void distinctElement(int arr[], int len){
        boolean visited[] = new boolean[len];
        Arrays.fill(visited,false);

        for(int i=0; i<len; i++){
            if(visited[i] == true)
                continue;
            
            int count = 1;
            for(int j=i+1; j<len; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            if(count == 1)
            System.out.print(arr[i] + " ");
        }
          
    }
}