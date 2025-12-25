interface t1{
    void meth1();
    void meth2();
}

interface t3{
    void meth3();
}

class te2 implements t1{
    public void meth1(){
        System.out.println("Meth 1 is called");
    }

    public void meth2(){
        System.out.print("Meth 2 is called");
    }
}

public class interfaces {
    public static void main(String[] args) {
        t1 t = new te2();
        t.meth1();
        t.meth2();
    }
}
