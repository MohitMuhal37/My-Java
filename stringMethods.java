import java.nio.charset.StandardCharsets;

public class stringMethods{
    public static void main(String[] args) {
        String str = "Welcome  ";

        int l = str.length();
        System.out.println(l);

        String str1 = str.toLowerCase();
        System.out.println(str1);

        str1 = str.toUpperCase();
        System.out.println(str1);

        str1 = str.trim();
        System.out.println(str1);

        str1 = str.substring(3);
        System.out.println(str1);

        str1 = str.substring(3, 6);
        System.out.println(str1);

        str1 = str.replace('c', 'f');
        System.out.println(str1);
    }
}