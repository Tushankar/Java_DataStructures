package SearchingSortBit;

import java.util.Arrays;
//Time complexity -> O(n2)
//Space complexity -> O(n)


//Descending order->40, 30, 20, 10, 5(Worst case Scenario)
//How many comparisons and how many swaps it depens on
//How many comparisos we undergo , Time complexity is summatioon of comparison ans swaps
//so if array is in descending order dont use this sort
//Best case -> in ascending order we will have 1 comparison and 0 swaps its complexity will be O(n);
//Its stable sorting algorithm


public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                //swap the elements between arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {20, 50, 25, 78, 12, 15};
        //function calling
        insertionSort(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
