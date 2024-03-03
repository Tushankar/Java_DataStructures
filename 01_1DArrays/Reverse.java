
public class Reverse {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};

        int n = arr.length;

        for(int i=0 ; i<n/2 ; i++){
            //Swap the elements between arr[i] and arr[n-i-1]
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("Reversal of an array is :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
