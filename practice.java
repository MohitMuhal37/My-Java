import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
      // find sum
        int arr[] = {12, 32, 443, 54, 5, 45, 6, 90, 67};
        int key = 45;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                System.out.print(i);
                System.exit(0);
            }
        }
            System.out.println("not valid");
    }
}
