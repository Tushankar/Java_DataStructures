package DivideAndConqQuestionSolv;
import java.util.*;

public class Question3 {
    public static boolean permute(Integer a[], Integer b[], int k, int n){
        //Sort in Ascending order
        Arrays.sort(a);
        //Sort in Desceding order
        Arrays.sort(b, Collections.reverseOrder());
        //Iterate and check Condirtion
        for(int i=0; i<n; i++){
            if(a[i]+b[i]<k){
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        Integer a[] = {2,1,3};
        Integer b[] = {7,8,9};
        int k = 10;
        int n = a.length;
        if(permute(a,b,k,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
