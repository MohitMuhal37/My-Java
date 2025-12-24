class Parent1{
    public Parent1(){
        System.out.println("Non Param Parent");
    }

    public Parent1(int x){
        System.out.println("Param Parent");
    }
}

class child1{
    public child1(){
        System.out.println("Non Param Child");
    }

    public child1(int y){
        System.out.println("Param Child");
    }
}


public class paranconstructInheritance {
    public static void main(String[] args) {
        child1 ch = new child1();
    }
}
