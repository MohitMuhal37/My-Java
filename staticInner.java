class outr{
    static int x = 10;
    int y = 20;
        static class inner
        {
           public void show()
           {
               System.out.println(x);
           }
        }
}


public class staticInner {
    public static void main(String[] args) {
        outr.inner o = new outr.inner();
        o.show();
    }
}
