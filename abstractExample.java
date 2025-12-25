abstract class Hospital{
    abstract void admit();
    abstract void emergency();
    abstract void provideMedicines();
    abstract void opd();
}

class myHospital extends Hospital{
    public void admit(){
        System.out.println("Your Patient is admit in our Hospital");
    }
    public void emergency(){
        System.out.println("Provide ICU");
    }
    public void provideMedicines(){
        System.out.println("We have also our medicine area");
    }
    public void opd(){
        System.out.println("Our OPD Starts from 9 to 1 & 3 to 5");
    }
}

public class abstractExample {
    public static void main(String[] args) {

    }
}
