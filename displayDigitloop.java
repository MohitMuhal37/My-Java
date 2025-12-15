import java.util.Scanner;
public class displayDigitloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Here :- ");
        int num = sc.nextInt();
        while(num > 0){
            int r = num % 10;
            num = num / 10;
            System.out.print(r+" ");
//            System.out.println(num+" ");
        }
    }
}
