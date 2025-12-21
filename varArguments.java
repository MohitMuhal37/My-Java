public class varArguments {

    static void varargs(int ...a){
        for(int x : a){
            System.out.print(x+" ");
        }
    }
    public static void main (String args[]){
       varargs();
        varargs(12, 43, 34, 56);
        varargs(43, 45);
    }
}
