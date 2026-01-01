import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class bufferDemo {
    public static void main(String[] args) {
        try{
    FileInputStream fis = new FileInputStream("src1.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);
            int x;
    while ((x = bis.read())!= -1) {
        System.out.print((char)x);
    }
    }catch(FileNotFoundException e){}
    catch(IOException e){}
}
}
