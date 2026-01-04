import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class client {
    public static void main(String[] args){

        try{
        Socket stk = new Socket("localhost",2000);

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        do
        {
            msg = key.readLine();
            ps.println(msg);

            msg = br.readLine();
            System.out.println("From Server = "+msg);
        }while(!msg.equals("dne"));
    }catch(UnknownHostException e){}
    catch(SocketException e){}
    catch(IOException e){}
}
}

