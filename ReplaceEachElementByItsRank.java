import java.util.Arrays;
public class ReplaceEachElementByItsRank{
    public static void main (String[] a){
        int arr[] = { 100, 2, 70, 12 , 90};
        changeArr(arr);
        System.out.println("Rank of Each Element In Array : "+Arrays.toString(arr));

    }

    static void changeArr(int arr[]){

        int newArray[] = Arrays.copyOfRange(arr, 0, arr.length);

        Arrays.sort(newArray);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(newArray[j] == arr[i]){
                    arr[i] = j+1;
                    break;
                }
            }
        }
    }
}