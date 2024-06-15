package HashMapQuestionSolving;

import java.util.Scanner;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], 1);
        }

        System.out.println("The largest element is : "+map.lastEntry().getKey());
        sc.close();

    }
}
