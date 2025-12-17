import java.util.Scanner;

public class gpSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int fNum = sc.nextInt();
        System.out.print("Enter Ratio = ");
        int diff = sc.nextInt();
        System.out.print("Enter Length of Number = ");
        int len = sc.nextInt();
        int i;
        for(i = 0; i < len; i++){
            System.out.print(fNum + ", ");
            fNum = fNum * diff;
        }
    }
}
