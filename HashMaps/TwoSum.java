import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();

        //input array elements in ana array
        int []arr = new int[n];
        System.out.println("Enter the array Elements ");
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        //input target element
        System.out.println("Enter the target element in the array: ");
        int target = sc.nextInt();

        //Create a hashmap where key is arr[i] and value is index num i
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], i);
        }
        //Create a result array to display the index of two nums
        int result[] = new int[2];
        //if current element is equal to the target
        for(int i=0; i<n; i++){
            if(arr[i] == target && map.containsKey(0)){
            result[0] = i;
            result[i] = map.get(0);
            break;
            }
            else if(map.containsKey(target - arr[i])){
                //is the element non repetable
                if(map.get(target-arr[i])>i){
                    result[0] = i;
                    result[1] = map.get(target-arr[i]);
                    break;
                }
            }
        }

        System.out.println("Two Sum index values are: "+result[0] +","+result[1]+";");
        sc.close();

    }
}
