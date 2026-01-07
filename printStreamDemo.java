// import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.IOException;

class Student2{
    int rollno;
    String name;
    String dept;
}

public class printStreamDemo {
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("My.txt");
        PrintStream ps = new PrintStream(fos);
        Student2 s = new Student2();
        s.name= "Mohit";
        s.rollno = 21;
        s.dept = "cse";

        ps.println(s.name);
        ps.println(s.dept);
        ps.println(s.rollno);
        
        ps.close();
        // FileInputStream fis  = new FileInputStream();
    }catch(FileNotFoundException e){}
    
}
}
