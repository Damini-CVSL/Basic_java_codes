public class FindLargestAndSmallestElementInArray{
    public static void main(String[] a){
        int arr[] = {1,5,25,3,552,6};

        int smallest = arr[0];
        int largest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i])
                smallest = arr[i];
            if(largest < arr[i])
                largest = arr[i];
        }
        System.out.println("Smallest Element "+smallest);
        System.out.println("Largest Element "+largest);
    }
    
}