@interface Myanno
{
    String name();
}

@Myanno(name = "Mohit")
public class annotation {
    public static void main(String[] args) {
        System.out.println("Hi i am Annotation");
    }
}
