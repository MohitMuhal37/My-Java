public class swappingWithXor{
    public static void main(String[] args) {
        int a = 10, b = 15;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Now a is = "+a + " and b is = "  + b);
    }
}