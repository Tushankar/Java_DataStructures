package Recursion;
import java.util.*;
//Time complexity : O(logb)

public class PowerOfElement {
    //function defination
    public static long powerFind(long a, long b){
        //Base case condition
        long mid = 0;
        long result = 0;
        long finalResult = 0;
        if(b == 1){
            return a;
        }
        //recursive function call
        else{
            mid = b/2;
            result = powerFind(a, mid);
            finalResult = result*result;
            if(b%2 == 0){
                return finalResult;
            }
            else{
                return a * finalResult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        long a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        long b = sc.nextInt();

        //function calling
        long result = powerFind(a, b);
        System.out.println("Power of a^b is: "+result);
        sc.close();
    }
}
