import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class copytwoFIleinOne {
    public static void main(String[] args) {
         try
        {
        FileInputStream fis =  new FileInputStream("src1.txt");
        FileInputStream fis1 =  new FileInputStream("src2.txt");

        FileOutputStream fos = new FileOutputStream("src3.txt");

        SequenceInputStream sq = new SequenceInputStream(fis, fis1);
        int x;
        while((x = sq.read())!= -1){
           fos.write(x);
        }
    }catch(FileNotFoundException e){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }
    }
}
