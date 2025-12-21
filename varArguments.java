public class varArguments {

    static void varargs(String ...a){
       for(int i = 0; i < a.length; i++){
           System.out.println(i+1 + ". "+a[i]);
       }
    }
    public static void main (String args[]){
     varargs("Max", "John", "Grey","Mantis", "Invencible","Laim");
    }
}
