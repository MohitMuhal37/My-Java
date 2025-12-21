public class gcdNumbers {

    static int gcd(int m, int n){
        while(m != n){
            if(m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }
    public static void main(String args[]){
        int a = 25;
        int b = 3;
        int c = gcd(a,b);
        System.out.println(c);
    }
}
