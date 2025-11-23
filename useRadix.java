import java.util.Scanner;

public class useRadix {
    public static void main(String[] args) {
        System.out.println("Enter Radix Value");
        Scanner sc = new Scanner(System.in);
        int x;
        sc.useRadix(2);
        x = sc.nextInt();
        System.out.println(x);
    }
}
