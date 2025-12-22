
class Employees{
    private String name;
    private String lastName;
    private int id;
    private int age;
    private char gender;
    private String branch;
    private String companyMail;
    private double income;

    public void setData(String fName, String lName, int nId, int nAge, char nGender, String nBranch
    , String nCompanymail, double nIncome){
        name = fName;
        lastName = lName;
        id = nId;
        age = nAge;
        gender = nGender;
        branch = nBranch;
        companyMail = nCompanymail;
        income = nIncome;
    }

    public String toString(){
        return " Employee Name is = "+name+"\n Last Name = "+lastName+"\n Id is = "+id+
                "\n Age = "+age+"\n Gender is = "+ gender+ "\n Branch is = "+branch+
                "\n CompanyMail = "+companyMail+ "\n Income is = "+income;
    }
}

public class dataHiding {
    public static void main(String[] args){
    Employees emp = new Employees();
    emp.setData("Mohit","Muhal",105,21,'M',"Backend Management",
            "MohitMuhal15122003@gmail.com",559897.00);
        System.out.print(emp);
    }
}
