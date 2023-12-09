public class DetermineCalAllNumbersofAnArrayBeMadeEqual{
    public static void main(String[] a){
        int arr[] = {50, 100, 75};
        int len = arr.length;

        if(isEqual(arr,len))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean isEqual(int arr[], int len){
        for(int i=0; i<len; i++){
            while(arr[i]%2 == 0)
                arr[i] /= 2;

            while(arr[i]%3 == 0)
                arr[i] /= 3; 

        }

        for(int i=1; i<len; i++){
            if(arr[i] != arr[0]){
                return false;
            }
        }
        return true;
    }
}