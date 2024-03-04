package SearchingSortBit;
//First occurence of an element

import java.util.Scanner;

public class LowerBound {


    public static int findFirstOccurence(int arr[], int target){
        int low=0, high = arr.length-1;
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                result = mid;
                //Go to the left side 
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
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
    int result = findFirstOccurence(arr, x);
    if(result == -1){
        System.out.println("Searched element is not found in array ");
    }
    else{
        System.out.println("Searched element is found at the location " +result);
    }

   }

}