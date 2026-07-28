public class printNum {

    public static int dec(int n){
        if (n > 1){
            for(int i = 0; i  < n; i++){
                System.out.print(n+" ");
            }
            return dec(n/2);
        }
        return n;
    }

    public static void main() {
        int a = 16;
        dec(a);
    }
}
