import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.stream.Stream;

class Student2 implements Serializable{
    int rollno;
    String name;
    String dept;
    transient int t;

    public Student2(){}

    public Student2(int r, String n, String d){
        rollno = r;
        name = n;
        dept = d;
    }
    public String toString(){
    return "\n Student Details"+
    "\nRollno "+rollno+
    "\nDept "+dept+
    "\nName "+name;
}
}

public class objectSerialization {
    public static void main(String[] args) {
        try{
    FileOutputStream fos  = new FileOutputStream("My.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Student2 s1 = new Student2(21,"Max","Cse");
    oos.writeObject(s1);

     FileInputStream fis  = new FileInputStream("My.txt");
    ObjectInputStream os = new ObjectInputStream(fis);
    Student2 s = (Student2)os.readObject();
        
            System.out.println(s);
        }catch(FileNotFoundException e){}
        catch(IOException e){}
        catch(ClassNotFoundException e){}
    }
}
