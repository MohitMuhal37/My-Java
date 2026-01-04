import java.net.*;
import java.io.*;

public class serverClient {
    public static void main(String[] args){
        try{
        ServerSocket ss = new ServerSocket();
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do
        {
            msg = br.readLine();

            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();

            ps.println(msg);
        }while(!msg.equals("dne"));
    }catch(UnknownHostException e){}
    catch(SocketException e){}
    catch(IOException e){}
}
}