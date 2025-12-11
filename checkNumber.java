import java.util.Scanner;
public class checkNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number = ");
        int b = sc.nextInt();
        System.out.print("Enter third Number = ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is The Greater Number");
        }
        else{
            if (b > c){
                System.out.println("B is Greater than c");
            }
            else{
                System.out.println("C is Greater");
            }
        }
    }
}