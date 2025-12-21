public class isPrimeNumber {

    static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % 2 == 0) {
                System.out.println("its a prime number ");
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 20;
        boolean c;
        c = isPrime(num);
        System.out.println(c);

    }
}
