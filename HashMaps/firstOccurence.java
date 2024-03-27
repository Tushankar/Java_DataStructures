import java.util.Scanner;
import java.util.*;
//Time Complexity : 

public class firstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        //Consstruction of a hashtable
        //key - unique characters in the string
        //value - Frequency of each character in the string

        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) +1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        //Scan the entire hashtable and get the index of the non-repeating character
        int result = -1;
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println("The first non Repeating character index is: " + i);
                result = 1;
                break;
            }
        }
        if(result == -1){
            System.out.println("No non-repeating character present in the string ");
        }

        sc.close();
    }
}
