class Mydata1
{
    int value = 0;
    boolean flag = true;
    public void set(int v)
    {
        while(flag != true){
            try{
                wait();
            }catch(Exception e){}
        value = v;
        flag = false;
        notify();
        }
    }

    public int get()
    {
        int x = 0;
        while(flag != false){
          try{
            wait();
          }catch(Exception e){}
            x = value;
        flag = true;
        notify();
        }
        return x;
    }
}

class Producer3 extends Thread
{
    Mydata1 data;

    public Producer3(Mydata1 d)
    {
        data = d;
    }

    public void run()
    {
        int count = 1;
        while(true){
           data.set(count);
           System.out.println("Producer = "+count); 
           count++;
        }
    }
}

class Consumer3 extends Thread
{
    Mydata1 data;

    public Consumer3(Mydata1 d)
    {
        data = d;
    }

    public void run()
    {
        while(true){
           int value;
           value = data.get();
           System.out.println("Producer = "+value); 
        }
    }
}



public class interThread
{
    public static void main(String[] args) 
    {
        Mydata1 data = new Mydata1();
        Producer3 p = new Producer3(data);
        Consumer3 c = new Consumer3(data);
        p.start();
        c.start();
    }
}