public class exceptionDemo {
    public static void main(String[] args){
        try
        {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.print("Result is = " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number is Not Divisible by zero  = "+e);
        }
        System.out.print("Program terminated Properly");
    }
}
