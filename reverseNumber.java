import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int r;
        while(num > 0){
           r = num % 10;
           rev = rev * 10 + r;
           num = num / 10;
        }

    }
}
