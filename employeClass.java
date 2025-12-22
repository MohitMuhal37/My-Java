
class Employee{
    int id;
    int age;
    String name;
    String lastName;
    char gender;
    String branch;
    String companyMail;
    double income;

   public void showDetails(){
       System.out.print("Employee id is = "+id+", Age = "+age+", Name is = "+name+
               ", LastName = "+lastName+", Gender is = "+ gender+ ", Branch is = "+branch+
               ", CompanyMail = "+companyMail+ ", Income is = "+income);
    }
}

public class employeClass {
    public static void main(String[] args){
    Employee emp = new Employee();
    emp.id = 101;
    emp.age = 27;
    emp.name = "Max";
    emp.lastName = "Murdock";
    emp.gender = 'M';
    emp.branch = "Webwork";
    emp.companyMail = "max@hotmail.com";
    emp.income = 55000.65;
    emp.showDetails();
    }
}
