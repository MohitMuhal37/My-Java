import java.util.Scanner;

public class fibonnachiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacchi Length = ");
        int num = sc.nextInt();
        int start = 0;
        int next = 1;
        int c, i;
        System.out.print(start + ", " + next + ", ");
        for(i = 0; i < num-2; i++){
            c = start + next;
            start = next;
            next = c;
            System.out.print(c + ", ");
        }
    }
}
