class myThread extends Thread{
    public myThread(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}
public class threadTest {
    public static void main(String[] args) {
        myThread t = new myThread("My Name");
        System.out.println(t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Alive "+t.isAlive());
        System.out.println("Id "+t.threadId());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
    }
}
