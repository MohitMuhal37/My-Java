import java.io.InputStream;
import java.io.OutputStream;

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
            System.out.println("Producer is Consumer "+x);
            System.out.flush();
            }catch(Exception e){}
        }
    }
}

public class pipeDemo {
    public static void main(String[] args) {
        
    }
}
