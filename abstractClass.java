
abstract class Super1{
    Super1(){
        System.out.println("Super Constructor");
    }

    void meth1(){
        System.out.println("Method 1");
    }

    abstract void meth2();
}

class Sub1 extends Super1{
    public void meth2(){
        System.out.println("Sub method");
    }
}
public class abstractClass {
    public static void main(String[] args) {
       Super1 s1 = new Sub1();
       s1.meth1();
     }
}
