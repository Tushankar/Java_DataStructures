import java.util.*;


public class typesOfMap{
    public static void main(String[] args) throws Exception {
        //Hashmap:Unordered return types 
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3, "Priya");
        map.put(1, "Ajay");
        map.put(7, "Piyush");
        map.put(5, "Jeet");

        System.out.println("Hashmap map looks like : " +map);
        
        //Linked hashmap -Order of insertion retained 
        LinkedHashMap<Integer,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(3, "Priya");
        linkedMap.put(1, "Ajay");
        linkedMap.put(7, "Piyush");
        linkedMap.put(5, "Jeet");

        System.out.println("Linked hashmap looks like : " +linkedMap);
  
        // TreeMap<Integer, String> Tree = new TreeMap<>();
        // Tree.put(3, "Priya");
        // Tree.put(1, "Ajay");
        // Tree.put(7, "Piyush");
        // Tree.put(5, "Jeet");

        // System.out.println("Linked hashmap looks like : " +Tree);

    


    }
}