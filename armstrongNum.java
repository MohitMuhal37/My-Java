import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Here :- ");
        int num = sc.nextInt();
        int sum = 0;
        int num1  = num;
        int r;
        while(num > 0){
            r = num % 10;
            num = num / 10;
            sum = sum + r*r*r;
        }
        System.out.println(sum);
        if (num1 == sum){
            System.out.print("It's an ArmStrong Number because " + sum + " = " + num1);
        }
        else{
            System.out.println("Not an ArmStrong Number");
        }
    }
}
