class Super{
    public void display(){
        System.out.println("Hello");
    }
}

class sub extends Super{
    @Override
    public void display(){
        System.out.println("Hello again");
    }
}
public class overriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();

        sub sb = new sub();
        sb.display();

        Super su1 = new Super();
        su.display();
    }
}
