public class recursion {
    static void recur(int n){
        if(n > 0){
            recur(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String args[]){
        recur(10);
    }
}
