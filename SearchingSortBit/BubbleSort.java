package SearchingSortBit;
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            //For every iterations we get the biggest element at the end
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap betwween arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {20, 50, 10, 12, 45, 67, 90};
        //function calling'
        bubbleSort(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
