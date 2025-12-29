class mThread extends Thread{
    public void run()
    {
        int i = 1;
        while (true){
            System.out.println(i+"My thread");
            i++;
        }
    }
}
public class threaDeamon {
    public static void main(String[] args){
    mThread m = new mThread();
    m.start();
    // m.setDaemon(true);
    int i = 1;
    while(true){
        System.out.println(i + "main");
        i++;
          Thread.yield();
    }
    }
}
