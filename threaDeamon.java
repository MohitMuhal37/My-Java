class mThread extends Thread{
    public void run()
    {
        int i = 1;
        while (true){
            System.out.println(i);
            i++;
        }
    }
}
public class threaDeamon {
    public static void main(String[] args){
    mThread m = new mThread();
    m.setDaemon(true);
    m.start();
    try{
        Thread.sleep(1000);
    }
    catch (InterruptedException e){
        System.out.println(e);
    }
    }
}
