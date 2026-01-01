import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Student1{
    int rollno;
    String name;
    String dept;
}

public class dataFileDemo {
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("My.txt");
        DataOutputStream dos = new DataOutputStream(fos);
       Student1 s = new Student1();
       s.dept = "cse";
       s.name = "Max";
       s.rollno = 211;  
       dos.writeInt(s.rollno);
       dos.writeChars(s.name);
       dos.writeChars(s.dept);

    }catch(FileNotFoundException e){}
    catch(IOException e){}
 }  
}
