import java.lang.Exception;
import java.io.*;

public class checkedUnchecked {

    static void fun1(){
        try {
           FileInputStream fi = new FileInputStream("My.txt");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args)
    {
        fun3();
    }
}
