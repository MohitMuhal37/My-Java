import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) {
        try
        {
          FileInputStream fis = new FileInputStream("c:/Users/HP/OneDrive/Desktop/Demo/Test.txt");
        //   byte b[] = new byte[fis.available()];
        //   fis.read(b);
        //   String str = new String(b);
        //   System.out.println(str);

        int x;
        // do{
        //     x = fis.read();
        //     if(x != -1)
        //     System.out.print((char)x);
        // }while(x != -1);

        while((x = fis.read())!= -1){
            System.out.print((char)x);
        }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
 }
}