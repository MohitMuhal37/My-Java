import java.util.Scanner;

class findRadix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String number here = ");
        String num = sc.nextLine();
        if(num.matches("[01]+")){
            System.out.print("Radix is Binary = "+num);
        }
        else if(num.matches("[0-7]+")){
            System.out.print("Radix is Octal = "+num);
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.print("Radix is Hexadecimal = "+num);
        }
        else{
            System.out.println("Invalid Case Find = "+num);
        }
    }
}