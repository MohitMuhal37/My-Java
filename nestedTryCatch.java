public class nestedTryCatch {
    public static void main(String[] args) {
        try{
            int arr[] = {10, 0, 8, 5, 3};

            try
            {
                int r;
                r = arr[0] / arr[1];
                System.out.println(r);
            }
            catch (ArithmeticException p)
            {
                System.out.println(p);
            }
            System.out.println(arr[9]);
        }
        catch(ArrayIndexOutOfBoundsException p)
        {
            System.out.println("Index is invalid = "+ p);
        }
    }
}
