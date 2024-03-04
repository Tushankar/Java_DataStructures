package SearchingSortBit;
//Modified binary search method
import java.util.Scanner;

public class SquareRoot {

    public static int findSquareRoot(int num){
        int low = 0, high = num, result = -1;

        while(low<=high){
            int mid = low + (high - low)/2;
            long val = mid * mid;

            if(val == num){
                //Perfect square num
                return mid;
            }
            else if(val < num){
                //store the floor value, incase the number is not a perfect square root, we can print the floor value
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root: ");
        int num = sc.nextInt();

        //Function calling
        int result = findSquareRoot(num);
        System.out.println("Square root of the given number: "+ num +" is: " +result);
        sc.close();
    }
}
