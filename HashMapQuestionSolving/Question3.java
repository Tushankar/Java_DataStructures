package HashMapQuestionSolving;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean duplicate = false;

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                duplicate = true;
                System.out.println("Yes");
                break;
            }
            map.put(arr[i], 1);
        }

        if(duplicate == false){
            System.out.println("No");
        }
        sc.close();
    }
}
