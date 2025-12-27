import java.util.*;

class Student{
    private String rollNo;
    private static int count = 1;
    private String genrateRollno()
    {
        Date d = new Date();
        String rn = "Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    public Student(){
        rollNo = genrateRollno();
    }

    public  String getRollNo(){
        return rollNo;
    }
}

public class staticChallenge {
    public static void main(String[] args) {
       Student s = new Student();
        System.out.print(s.getRollNo());
    }
}
