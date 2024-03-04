import java.io.*;
import java.util.Scanner;

public class PrefixSumOptmized {

    public static void prefixSumMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        //Traverse the array row-wise to calculate the row wise prefix sum
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        //Traverse the array column-wise to calculate the column wise prefix sum
        for(int j=0; j<n; j++){
            for(int i=1; i<m; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    public static int sumRegion(int arr[][], int r1, int c1, int r2, int c2){
        int sum = 0, up = 0, left = 0, repeated_region = 0, result = 0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeated_region = arr[r1-1][c1-1];

        result = sum - up -left + repeated_region;
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Enter the matrix elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of r1 coordinate: ");
        int r1 = sc.nextInt();

        System.out.println("Enter the value of c1 coordinate: ");
        int c1 = sc.nextInt();

        System.out.println("Enter the value of r2 coordinate: ");
        int r2 = sc.nextInt();

        System.out.println("Enter the value of c2 coordinate: ");
        int c2 = sc.nextInt();

        prefixSumMatrix(arr);

        int result = sumRegion(arr,r1,c1,r2,c2);
        System.out.println("Sum of elements of the given rectangle is: " + result);
        sc.close();


    }
}
