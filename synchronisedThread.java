class Mydata
{
 public void display(String str)
    {
        synchronized(this){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}
}

class mythread1 extends Thread
{
    Mydata d;
    public mythread1(Mydata dat)
    {
        d = dat;
    }

    public void run()
    {
        d.display("Hello world");
    }
}

class mythread2 extends Thread
{
    Mydata data;
    public mythread2(Mydata dat)
    {
        data = dat;
    }

    public void run()
    {
        data.display("welcome");
    }
}

public class synchronisedThread {
    public static void main(String[] args) {
        Mydata d = new Mydata();
        mythread1 m1 = new mythread1(d);
        mythread2 m2  = new mythread2(d);

        m1.start();
        m2.start();
    }
}
