public class tailRecursion {
    public static void dec(int n){
        if(n > 1){
            dec(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        dec(x);
    }
}
