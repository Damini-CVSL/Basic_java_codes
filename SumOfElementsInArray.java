public class SumOfElementsInArray{
    public static void main(String[] a){
        int[] arr = {20,50,10,30};
        int len = arr.length;
        int sum = 0;

        for(int i=0; i<len; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}