package Recursion;

import java.util.Scanner;

public class FibonacciFInd {
    //function defination
    public static int fibonacciFinding(int n){
        int result = 0;
        //Base case condition
        if(n<=1){
            return n;
        }
        //Recusivbe call
        else{
            result = fibonacciFinding(n-1)+fibonacciFinding(n-2);
        }
        return result;  
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in fib series: ");
        int n = sc.nextInt();

        int result = fibonacciFinding(n);
        System.out.println("The nth fibonacci number is :"+ result);
    }
}
