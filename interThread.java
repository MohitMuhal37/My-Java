class Mydata{
    int value = 0;
    boolean flag = true;

    public void set(int v){
        while (flag != true) {
            
        }
    }

    public int get(){
        int x = 0;
        x = value;
        return x; 
    }
}

class Producer extends Thread
{
    Mydata d;
    Producer(Mydata dat)
    {
        d = dat;
    }

    public void run()
    {
        int  i = 1;
        while (true) {
            d.set(i);
            System.out.print("Producer = "+i);
            i++;
        }
    }
}

class Consumer extends Thread
{
    Mydata d;
    Consumer(Mydata dat)
    {
        d = dat;
    }

    public void run()
    {
        while (true) {
            System.out.print("Producer = "+d.get());
        }
    }
}
public class interThread {
   public static void main(String[] args) {
    
   } 
}
