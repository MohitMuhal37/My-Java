class Parent{
    public Parent(){
        System.out.println("Parent Class");
    }
}

class child extends Parent{
    public child(){
        System.out.println("Child Class");
    }
}

class GrandChild{
    public GrandChild(){
        System.out.println("GrandChild Class");
    }
}

public class constructorInheritance {
    public static void main(String[] args) {
        GrandChild gp = new GrandChild();
    }
}
