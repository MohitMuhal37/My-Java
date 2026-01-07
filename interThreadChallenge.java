//class Whiteboard
//{
//    String text;
//    int noOfStudent = 0;
//    int count = 0;
//
//    public void attend(){
//    noOfStudent++;
//   }
//
//   synchronized public void write(String msg)
//    {
//        while (count != 0) {
//            try{
//                wait();
//            }catch(Exception e){}
//            text = msg;
//            count = noOfStudent;
//            notifyAll();
//        }
//    }
//
//    synchronized public String read()
//    {
//        while(count == 0)
//        try{
//            wait();
//        }catch(Exception e){}
//        String msg  = text;
//        count--;
//        if(count == 0)
//               notify();
//        return msg;
//    }
//}
//
//
//class teacher extends Thread
//{
//    Whiteboard wd;
//    String notes[] = {"Java is Language","Its Oop","It support multithreading","It is Secure"};
//    public teacher(Whiteboard w){
//         wd = w;
//    }
//
//    public void run()
//    {
//      for(int i = 0; i < notes.length; i++){
//        wd.write(notes[i]);
//      }
//    }
//}
//
//class Student1 extends Thread{
//    Whiteboard wd;
//    String name;
//
//    public Student1(String n, Whiteboard w){
//        name =n;
//        wd = w;
//    }
//
//    public void run(){
//        String text;
//        wd.attend();
//
//        do{
//            text = wd.read();
//            System.out.println(name+" Reading "+text);
//            System.out.flush();
//        }while(!text.equals("end"));
//    }
//}
//
//public class interThreadChallenge {
//    public static void main(String[] args) {
//        Whiteboard wd = new Whiteboard();
//        teacher t = new teacher(wd);
//
//        Student1 s = new Student1("1. John", wd);
//        Student1 s1 = new Student1("2. Jack", wd);
//        Student1 s2 = new Student1("3. Mat", wd);
//        Student1 s3 = new Student1("4. Max", wd);
//        Student1 s4 = new Student1("5. Mohan", wd);
//
//        t.start();
//
//        s.start();
//        s1.start();
//        s2.start();
//        s3.start();
//        s4.start();
//    }
//}
