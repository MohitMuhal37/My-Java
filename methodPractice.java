public class methodPractice {
    static int max(int x, int y){
        if(x > y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        int a = 18, b = 10, c;
//        methodPractice mp = new methodPractice();
//        System.out.print(mp.max(a, b));
        c = max(a, b);
        System.out.print(c);
    }
}
