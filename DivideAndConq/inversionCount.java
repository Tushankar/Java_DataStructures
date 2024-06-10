
public class inversionCount {
    //brute force
    public static int InversionCount(int arr[], int n){
        int count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {1,5,2,8,3,4};
        int n = arr.length;

        int count = InversionCount(arr, n);

        System.out.println("The inversion count of an array is: " +count);

    }
}
