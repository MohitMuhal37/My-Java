import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] ={12, 23, 45, 65, 67, 76, 88};
        Scanner sc = new Scanner(System.in);
        int key = 76;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.print("Key is found At location of :- "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
