public class stringSymbols{
    public static void main(String[] args) {
        String str1 = "a";
        System.out.println(str1.matches("abc"));
        System.out.println(str1.matches("[^abc]"));

        //Meta characters
        System.out.println(str1.matches("\\w"));
        System.out.println(str1.matches("\\W"));
        System.out.println(str1.matches("\\d"));
        System.out.println(str1.matches("\\D"));
        System.out.println(str1.matches("\\s"));
        System.out.println(str1.matches("\\S"));
    }
}