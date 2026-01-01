import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {
    public static void main(String[] args) {
        try{
        FileInputStream fis =  new FileInputStream("src1.txt");
        FileOutputStream fos = new FileOutputStream("src2.txt");
        int x;
        while((x = fis.read())!= -1){
            System.out.println((char)x);
            if(x >= 65 && x <= 90){
                fos.write(x+32);
            }
            else{
                fos.write(x);
            }
        }
    }catch(FileNotFoundException e){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }
}
}