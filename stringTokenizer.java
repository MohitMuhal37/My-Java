import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        String data = "name=Mohit;adress=Krishanpura;countary=India;dept=cse";
        StringTokenizer st = new StringTokenizer(data,"=;");
        String s;
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
