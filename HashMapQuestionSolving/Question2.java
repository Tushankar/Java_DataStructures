package HashMapQuestionSolving;

import java.util.Scanner;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of key value pairs: ");
        int n = sc.nextInt();
        TreeMap<String,Integer> map = new TreeMap<>();

        System.out.println("Enter the Key-Value pairs : ");
        for(int i=0; i<n; i++){
            int key = sc.nextInt();
            String value = sc.next();
            map.put(value, key);
        }

        System.out.println("The map is : "+map);
        sc.close();
    }
}
