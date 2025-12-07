public class stringSymbols{
    public static void main(String[] args) {
        String str1 = "%";
        System.out.println(str1.matches("abc"));
        System.out.println(str1.matches("[^abc]"));
    }
}