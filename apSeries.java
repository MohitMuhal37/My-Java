import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter First Number = ");
        int fnum = sc.nextInt();
        System.out.print("Enter Difference = ");
        int diff = sc.nextInt();
        System.out.print("Enter length of Number where You want to print this series = ");
        int len = sc.nextInt();
//        for(i = 0; i < len; i++){
//            System.out.print(fnum+", ");
//           fnum = fnum + diff;
            while(i < len){
                System.out.print(fnum+", ");
                fnum = fnum + diff;
                i++;
        }


    }
}
