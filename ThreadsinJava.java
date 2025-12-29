// class MyThread extends Thread{
//     public void run()
//     {
//         int i = 1;
//         while(true){
//             System.out.println(i+"Hello");
//             i++;
//         }
//     }
// }

public class ThreadsinJava extends Thread{

    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ThreadsinJava tj = new ThreadsinJava();
        tj.start();
        int i = 1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
