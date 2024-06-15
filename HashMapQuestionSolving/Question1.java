package HashMapQuestionSolving;

import java.util.Scanner;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of key value pairs : ");
        int n = sc.nextInt();

        TreeMap<Integer,String> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            int key = sc.nextInt();
            String value = sc.next();
            map.put(key, value);
        }

        System.out.println("The map is : "+map);
        sc.close();
    }
}
