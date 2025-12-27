abstract class anonymous{
    abstract void show();
}

class anony{
    public void display(){
        anonymous an = new anonymous(){
            public void show(){
                System.out.println("Hello I am Anonymous");
            }
        };
        an.show();
    }
}

public class anonymousInner {
    public static void main(String args[]){
        anony a = new anony();
        a.display();
    }
}
