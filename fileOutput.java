import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutput {
    public static void main(String[] args) {
    try
    {
    FileOutputStream fos  = new FileOutputStream( "c:/Users/HP/OneDrive/Desktop/Demo/Test.txt");
    String str = "Hello I am here";
    fos.write(str.getBytes());
    fos.close();
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }
 }
}