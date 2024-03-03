
public class Duplicates{
    public static void main(String[] args){
       int arr[] = {1, 2, 2, 4, 5};
       int n = arr.length;
       //Tc-> Big O of n2
       //Sc-> constant
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
            if(arr[i] == arr[j]){
                System.out.println("Duplicates element : " + arr[i]);
            }
           }
       }
    }
}