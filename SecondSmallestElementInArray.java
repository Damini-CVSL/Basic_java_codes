public class SecondSmallestElementInArray{
    public static void main(String[] a){
        int arr[] = {5,69,54,2,1,36,5};
        int arrlen = arr.length;
        System.out.println("Second last element in arry is : "+requiredElement(arr,arrlen));
    }

    static int requiredElement(int arr[], int arrlen){
        int smallest = arr[0];
        for(int i=0; i<arrlen; i++){
            if(smallest > arr[i])
                smallest = arr[i];
        }

        int sec_smallest = Integer.MAX_VALUE;
        for(int i=0; i<arrlen; i++){
            if(arr[i] != smallest && sec_smallest > arr[i])
                sec_smallest = arr[i];
        }

        return sec_smallest;

    }
}