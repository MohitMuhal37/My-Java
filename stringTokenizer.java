import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("src4.txt");
        byte b[] = new byte[fis.available()];
        fis.read();
        String data = new String(b);
        // String data = "name=Mohit;adress=Krishanpura;countary=India;dept=cse";
        StringTokenizer st = new StringTokenizer(data,"=");
        String s;
        while (st.hasMoreTokens()) {
            s = st.nextToken();
            System.out.println(s);
        }
    }
}
