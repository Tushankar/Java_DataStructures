import java.util.*;
// import java.io.*;

public class ImplementFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();

        //Functionality of the put() function
        hashmap.put(1, "Tushankar");
        hashmap.put(3, "Priya");
        hashmap.put(5, "Karan");
        hashmap.put(8, "Astha");

        System.out.println("Hashmap of the given data is: " +hashmap);

        //Functionality of the get() function
        String result = hashmap.get(3);
        System.out.println("Value for the given key is: "+result);

        //Functionality of the containsKey() function
        System.out.println(hashmap.containsKey(3));

        //Functionality of the remove(function)
        hashmap.remove(1);
        System.out.println("Updated hashMap :" +hashmap);

        //Iterating using the for loop
        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.err.print("Hasmap is : ");
            System.out.println(e.getKey()+ " : "+e.getValue());
        }

    }
}
