import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferDemo {
    public static void main(String[] args) {
        try{
    FileInputStream fis = new FileInputStream("src1.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);
    FileReader fr = new FileReader("src1.txt");
    BufferedReader br = new BufferedReader(fr);
            int x;
    while ((x = bis.read())!= -1) {
        System.out.print((char)x);
    }
    bis.mark(10);
     System.out.print((char)br.read());
     System.out.print((char)br.read());
     System.out.print((char)br.read());
     System.out.print((char)br.read());
     bis.reset();
     System.out.print((char)br.read());
    System.out.println();
    System.out.println(bis.markSupported());
    System.out.println(fis.markSupported());
    }catch(FileNotFoundException e){}
    catch(IOException e){}
}
}
