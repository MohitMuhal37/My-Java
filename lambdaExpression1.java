interface myLambda
{
    public void meth1();
}

class uLambda
{
    public void mlambda(myLambda ml)
    {
      ml.meth1();  
    }
}

class demo
{
    public void meth2(){
    uLambda ul = new uLambda();
    ul.mlambda(()->{System.out.println("Hello");});
  }
}

public class lambdaExpression1 {
    public static void main(String[] args) {
       demo d = new demo();
       d.meth2();
    }
}
