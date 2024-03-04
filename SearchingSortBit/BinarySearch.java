package SearchingSortBit;
import java.util.*;

//Time complexity : O(logn)
//Space complexity : o(n)

//For this we need sorted array

public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int low=0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements presenr in array ");
    int n = sc.nextInt();

    System.out.println("Enter the array elements ");
    int arr[] = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    //Target elements from the user
    System.out.println("Enter the target Element: ");
    int x = sc.nextInt();
    sc.close();
    //Function calling of binary search
    int result = binarySearch(arr, x);
    if(result == 0){
        System.out.println("Searched element is not found in array ");
    }
    else{
        System.out.println("Searched element is found at the location " +result);
    }

   }

}