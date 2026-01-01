import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Student1{
    int rollno;
    String name;
    String dept;
}

public class dataFileInput {
    public static void main(String[] args) {
        try{
        FileInputStream fos = new FileInputStream("My.txt");
        DataInputStream dos = new DataInputStream(fos);
       Student1 s = new Student1();
       s.dept = dos.readUTF();
       s.name = dos.readUTF();
       s.rollno = dos.readInt();


       System.out.println(s.rollno+" "+s.dept+" "+s.name);

    }catch(FileNotFoundException e){}
    catch(IOException e){}
 }  
}

