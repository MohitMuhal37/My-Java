class myThread extends Thread{
    public myThread(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run()
    {
        int i = 1;
        while (true){
            System.out.println(i);
            i++;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class threadTest {
    public static void main(String[] args) {
        myThread t = new myThread("My Name");
//        System.out.println(t.getId());
//        System.out.println("Name "+t.getName());
//        System.out.println("Alive "+t.isAlive());
//        System.out.println("Id "+t.threadId());
//        System.out.println("Priority "+t.getPriority());
        t.start();
        t.interrupt();
//        System.out.println("State "+t.getState());
    }
}
