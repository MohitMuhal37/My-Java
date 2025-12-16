import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Here :- ");
        int num = sc.nextInt();
        int sum = 0;
        int r;
        while(num > 0){
            r = num % 10;
            num = num / 10;
            sum = sum + r*r*r;
            System.out.println(r+" ");
            System.out.println(sum);
        }
    }
}
