import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccess {
    public static void main(String[] args) {
        try{
        RandomAccessFile rsf = new RandomAccessFile("src1.txt","rw");
        System.out.println((char)rsf.read());
        System.out.println((char)rsf.read());
        System.out.println((char)rsf.read());
        System.out.println((char)rsf.read());
        System.out.println((char)rsf.read());
        rsf.write('w');
        System.out.println((char)rsf.read());
    }catch(FileNotFoundException e){}
    catch(IOException e){}
 }
}
