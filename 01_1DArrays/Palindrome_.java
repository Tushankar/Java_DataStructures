public class Palindrome_{
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        int flag = 0;

        int n = arr.length;

        for(int i = 0; i<n/2; i++){
          
            if(arr[i] != arr[n-i-1]){
                flag =1;
                System.out.println("Not a palindromic array");
                break;
            }
        }

        if(flag == 0){
            System.out.println("Palindromic array");
        }
    }
}
