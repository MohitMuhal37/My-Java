import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;

public class properties {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("Brand", "HP");
        p.setProperty("Processor", "i3");
        p.setProperty("os", "Windows 11");
        p.setProperty("Model", "N305");

        try{
             p.store(new FileOutputStream("src4.txt"), "Laptop");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
