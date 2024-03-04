package SearchingSortBit;

import java.util.Arrays;


//Time complexity : O(n2) 
//Space complexity : O(1)
//At every iteration, we get smaller element inthe extreme left
//If you want to find top two smallest element use selection sort
//if you want to find last two largest element use bubble sort

public class SelectionSort {

    public static void selectionSOrt(int[] arr){
        for(int i=0; i<arr.length; i++){
            //min_index is taking the index of minimum element at every iterations
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            if(min_index != i){
                //swap arr of mininded and arrof i
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int []arr = {20, 50, 12, 17, 19, 97, 16};
        //Function calling
        selectionSOrt(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
