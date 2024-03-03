public class MissingElement {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 7, 6, 5};
        int n = arr.length;
        //Sum of natural numbers in an array
        int sum_natural_num = ((n+1)*(n+2))/2;

        int sum = 0;
        //Sum of current elements present in array
        for(int i=0; i<n; i++){
            sum+= arr[i];
        }

        int missing_elem = 0;
        missing_elem = sum_natural_num - sum;
        System.out.println("Missing elements in array is:"+missing_elem);
   }
}
