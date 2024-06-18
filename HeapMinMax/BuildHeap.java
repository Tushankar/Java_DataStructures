package HeapMinMax;



public class BuildHeap {
    //function defination

    public static void heapify(int arr[], int n, int i){
        //Assuming parent node contains the largest data
        int largest = i;
        int leftIdx = 2*i+1;
        int rightIdx = 2*i+2;

        if(leftIdx <n && arr[leftIdx] > arr[largest]){
            largest = leftIdx;
        }
        if(rightIdx <n && arr[rightIdx] > arr[largest]){
            largest = rightIdx;
        }

        if(largest!= i){
            //swap between the value of (arr[largest], arr[i])
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            //Recursion
            heapify(arr, n, largest);
        }
    }
    public static void buildHeap(int arr[], int n){
        int startIdx = n/2-1;
        for(int i=startIdx; i>=0; i--){
            //function calling
            heapify(arr,n,i);
        }
    }

    public static void displayHeap(int arr[], int n){
        System.out.println("Array representation of maxHeap");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println(" ");
    }



    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n = arr.length;

        //function calling
        buildHeap(arr, n);
        displayHeap(arr, n);
    }
}
