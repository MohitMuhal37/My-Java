import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
      // find sum
        int arr[] = {12, 32, 443, 54, 5, 45, 6, 90, 67};
        int max = arr[0];
        int max1 = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max1 = max;
                max = arr[i];
            }
            else if(arr[i] > max1) {
                max1 = arr[i];
            }
        }
        System.out.println(max1);
    }
}
