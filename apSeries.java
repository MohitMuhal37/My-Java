import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter First Number = ");
        int fUm = sc.nextInt();
        System.out.print("Enter Difference = ");
        int diff = sc.nextInt();
        System.out.print("Enter lenhth of Number where You want to print this series = ");
        int len = sc.nextInt();

        for(i = fUm; i <= len; i = i += diff){
            System.out.print(i + ", ");
        }
    }
}
