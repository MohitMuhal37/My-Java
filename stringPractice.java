public class stringPractice{
    public static void main(String[] args) {
        String str = "Java Program";
        System.out.println(str);

        String str1 = new String("Java");

        char c[] = {'A', 'B', 'C', 'D'};
        String str2 = new String(c);

        byte b[] = {65, 66, 67, 91};
        String str3 = new String(b,2,2);
        System.out.println(str3);
    }
}