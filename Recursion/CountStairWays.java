package Recursion;
import java.util.*;
public class CountStairWays {
    //function defination
    public static int countNumStair(int n){
        int result = 0;
        if(n<=1){
            return n;
        }
        else{
            result = countNumStair(n-1) + countNumStair(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs : ");
        int n = sc.nextInt();

        //function calling
        //relationshiop between count of stairs problem and fibonacci series problem
        int result = countNumStair(n+1);
        System.out.println("The number of ways is: " + result);
        sc.close();
    }
}
