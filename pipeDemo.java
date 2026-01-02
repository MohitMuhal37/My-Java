import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;

    public Producer(OutputStream o){
        os = o;
    }

    public void run()
    {
        int count = 1;

        while(true){
            try{
            os.write(count);
            os.flush();
            Thread.sleep(10);
            System.out.println("Producer is Producing "+count);
            count++;
            }catch(Exception e){}
        }
    }
}


class Consumer extends Thread{
    InputStream Is;

    public Consumer(InputStream i){
        Is = i;
    }

    public void run()
    {
       int x;
      {
            try{
                x = Is.read();
            System.out.println("Consumer is Consuming "+x);
            System.out.flush();
            }catch(Exception e){}
        }
    }
}

public class pipeDemo {
    public static void main(String[] args)throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
