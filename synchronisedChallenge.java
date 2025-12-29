class Atm
{
   synchronized public void checkBalance(String name){
         System.out.println(name+" Checked the balance");
        try
        {
        Thread.sleep(1000);
    }catch(InterruptedException e){
        System.out.println(e);
    }
}
   synchronized public void widhrawAmount(String name,int amount){
        System.out.println(name+" Widhraw "+amount);
          try
        {
        Thread.sleep(1000);
    }catch(InterruptedException e){
        System.out.println(e);
    }
    }
}

class thread1 extends Thread
{
     Atm atm;
    String name;
    int amount;

   public thread1(Atm a, String n, int an){
        atm = a;
        name = n;
        amount = an;
   }

   public void useAtm(){
    atm.checkBalance(name);
    atm.widhrawAmount(name, amount);
   }
    public void run()
    {
       useAtm();
    }
}


class thread2 extends Thread
{
    Atm atm;
    String name;
    int amnt;

   public thread2(Atm a, String n, int an){
        atm = a;
        name = n;
        amnt = an;
   }

   public void useAtm(){
    atm.checkBalance(name);
    atm.widhrawAmount(name, amnt);
   }
    public void run()
    {
       useAtm();
    }
}
public class synchronisedChallenge {
    public static void main(String[] args) {
        Atm atm = new Atm();
        thread1 t = new thread1(atm, "Max",123);
        thread1 t1 = new thread1(atm, "Mat",2398);
        t.start();
        t1.start();
        // thread2 t1 = new thread2(atm, "Max",123);
    }
}
