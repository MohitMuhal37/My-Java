import java.io.FileInputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Student3 implements Serializable{
    int rollno;
    String name;
    String dept;
    transient int t;

    public Student3(){}

    public Student3(int r, String n, String d){
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


public class objectInputStream {
         public static void main(String[] args) {
        try{
    FileInputStream fos  = new FileInputStream("My.txt");
    ObjectInputStream oos = new ObjectInputStream(fos);
    Student3 s = (Student3)oos.readObject();
        
            System.out.println(s);
        }catch(FileNotFoundException e){}
        catch(IOException e){}
        catch(ClassNotFoundException e){}
    }
    }
