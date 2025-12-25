class store{
    member mem[] = new member[100];
   int count = 0;

   void register(member m){
       mem[count++] = m;
   }

   void inviteSale(){
       for(int i = 0; i < count; i++){
           mem[i].callMember();
       }
   }
}


interface member{
    void callMember();
}

class customer implements member{
    String name;

    customer(String name){
        this.name = name;
    }

   public void callMember(){
       System.out.println("Ok i will visit Store :- "+name);
    }
}

public class interfacePractice2 {
    public static void main(String[] args) {
        store s1 = new store();
        customer c1 = new customer("Mohit");
        customer c2 = new customer("Max");
        s1.register(c1);
        s1.register(c2);
        s1.inviteSale();
    }
}
