import java.io.ByteArrayInputStream;
import java.io.IOException;
public class byteInputStream {
    public static void main(String[] args) {
        byte b[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        ByteArrayInputStream bis  = new ByteArrayInputStream(b);
        // int x;
        // while((x = bis.read())!= -1){
        //     System.out.print((char)x);
        // }

        String str = new String(bis.readAllBytes());
        System.out.print(str);
        try{
        bis.close();
        }catch(IOException e){
            System.out.println(e);
        }
 }
}
