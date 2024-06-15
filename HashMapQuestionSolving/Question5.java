package HashMapQuestionSolving;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransomnote String :");
        String r = sc.nextLine();
        System.out.println("Enter the magazine string : ");
        String m = sc.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<r.length(); i++){
            char c = r.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c) +1);
            }
            else{
                map1.put(c,1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<m.length(); i++){
            char c = m.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c, map1.get(c) +1);
            }
            else{
                map2.put(c,1);
            }
        }

        boolean ans = true;
        for(Map.Entry<Character, Integer> e : map1.entrySet()){
           if(!map2.containsKey(e.getKey()) || e.getValue() >map2.get(e.getKey())){
            ans = false;
            break;
           }
        }
        System.out.println(ans);
        sc.close();
    }
}
