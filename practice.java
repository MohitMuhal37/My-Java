import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //count digit
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
//            int r = num % 10;
            num = num / 10;
//            System.out.print(r + " ");
//            System.out.println(num);
            count++;
        }
        System.out.println(count);
    }
}
