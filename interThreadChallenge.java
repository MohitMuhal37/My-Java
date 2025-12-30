class Whiteboard
{
    String text;
    int noOfStudent = 0;
    int count = 0;
   
    public void attend(){
    noOfStudent++;
   }

   synchronized public void write(String msg)
    {
        while (count != 0) {
            try{
                wait();
            }catch(Exception e){}
            text = msg;
            count = noOfStudent;
            notifyAll();
        }
    }

    synchronized public String read()
    {
        while(count == 0)
        try{
            wait();
        }catch(Exception e){}
        String msg  = text;
        count--;
        if(count == 0)
               notify();
        return msg;
    }
}


class teacher extends Thread
{
    Whiteboard wd;
    String notes[] = {"Java is Language","Its Oop","It support multithreading","It is Secure"};
    public teacher(Whiteboard w){
         wd = w;
    }

    public void run()
    {
      for(int i = 0; i < notes.length; i++){
        wd.write(notes[i]);
      }
    }
}

class Student extends Thread{
    Whiteboard wd;
    String name;

    public Student(String n, Whiteboard w){
        name =n;
        wd = w;
    }

    public void run(){
        String text;
        wd.attend();

        do{
            text = wd.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class interThreadChallenge {
    public static void main(String[] args) {
        Whiteboard wd = new Whiteboard();
        teacher t = new teacher(wd);

        Student s = new Student("1. John", wd);
        Student s1 = new Student("2. Jack", wd);
        Student s2 = new Student("3. Mat", wd);
        Student s3 = new Student("4. Max", wd);
        Student s4 = new Student("5. Mohan", wd);

        t.start();

        s.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
