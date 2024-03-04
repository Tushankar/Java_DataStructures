package SearchingSortBit;

import java.util.*;
// import java.io.*;

//Time complexity: O(n)
//Space complexity: O(1): constant

public class LinearSearch {
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

        //Implementation of linear search
        int idx = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
               idx = i;
               break;
            }
        }
        if(idx == -1){
            System.out.println("Seached element is not found in array ");
        }
        else{
            System.out.println("Searched element is found in the location : "+ idx);
        }

        sc.close();
    }
}
