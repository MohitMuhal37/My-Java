public class methodOverloading {
    static int max(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }

    static float max(float a, float b){
        if (a > b)
            return a;
        else
            return b;
    }
    public static void main(String[] args){

        System.out.print(max(12f, 54f));
    }
}
