class Mydata
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

class Producer extends Thread
{
    Mydata data;

    public Producer(Mydata d)
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

class Consumer extends Thread
{
    Mydata data;

    public Consumer(Mydata d)
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
        Mydata data = new Mydata();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}