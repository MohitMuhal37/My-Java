import java.util.Scanner;
class loopPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Here = ");
        int num = sc.nextInt();
        int sum = 0;
//        for(int i = 1; i <= 10; i++){
//            int val = num * i;
//            System.out.println(val);
//        }

        for(int i = 0; i <= 10; i++){
            sum = num + i;
            System.out.println(sum);
        }
    }
}