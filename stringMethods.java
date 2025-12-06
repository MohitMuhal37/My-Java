import java.nio.charset.StandardCharsets;

public class stringMethods{
    public static void main(String[] args) {
        String str = "Welcome  ";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "pava";

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

        System.out.println(str1.charAt(5));
        System.out.println(str1.indexOf('f'));
        System.out.println(str1.lastIndexOf('e'));

        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str4.compareTo(str3));

    }
}