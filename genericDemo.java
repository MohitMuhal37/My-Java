public class genericDemo {
    public static void main(String[] args) {
        Object obj = new String("Hi");
        obj = new Integer(10);
        String str = (String)obj;
        Object obj1[] = new Object[3];
        obj1[1] = "hlo";
        obj1[2] = 12;

        for(int i = 0; i < 3; i++){
            str = (String)obj1[i];
            System.out.println(str);
        }

    }
}
