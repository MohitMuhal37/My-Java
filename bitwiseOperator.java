 public class bitwiseOperator{
     public static void main(String[] args) {
         int x = 10;
         int b = 1;
         int z;
         z = (x >> b);
         System.out.println(z);
         z = (x << b);
         System.out.println(z);
         z = (x << 2);
         System.out.println(z);
         z = ~x;
         System.out.println(String.format("%s",Integer.toBinaryString(z)));
         System.out.println(String.format("%s",Integer.toBinaryString(x)));
         System.out.println(z);
     }
}
