interface myLambda
{
    public void meth1();
}

class demo
{
    int count = 0;
    public void meth2(){
        // int count = 0;
   myLambda l = ()->{System.out.println("Hello"+count++); //can acces lambda expression
    System.out.println("Bye");

   };
    l.meth1();
  }
}

public class lambdaExpression1 {
    public static void main(String[] args) {
        
    }
}
