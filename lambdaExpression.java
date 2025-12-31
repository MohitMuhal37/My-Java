@FunctionalInterface
interface lambda
{
    public void show(String s, int age);
}

public class lambdaExpression
{
    public static void main(String[] args) {
        lambda l = (s, a)->{System.out.println(s+" "+a);};
        l.show(" Max ",22);
    }
}