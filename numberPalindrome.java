import java.util.Scanner;

public class numberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number here :- ");
        int num = sc.nextInt();
        int r;
        int rev = 0;
        int num1 = rev;
        while(num > 0){
            r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println("Your Reverse Number is :- ");
    }
}
