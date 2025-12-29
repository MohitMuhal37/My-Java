class Myrun implements Runnable
{
    public void run(){}
}

public class threadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Myrun(),"My Name");
    }
}
