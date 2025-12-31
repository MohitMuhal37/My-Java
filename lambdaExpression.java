interface lambda
{
    public void show();
}

public class lambdaExpression
{
    public static void main(String[] args) {
        lambda l = ()->{System.out.println("Hello All");};
        l.show();
    }
}