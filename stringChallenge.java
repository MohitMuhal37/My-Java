public class stringChallenge{
    public static void main(String[] args) {
        String str = "max@gmail.com";
        int i = str.indexOf("@");
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(4,13));

        String username = str.substring(0,i);
        String domain = str.substring(i+1, str.length());
        System.out.println("Username = " + username);
        System.out.println("domain = " + domain);


    }
}