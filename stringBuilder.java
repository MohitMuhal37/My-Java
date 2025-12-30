public class stringBuilder {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        StringBuilder s3 = new StringBuilder("Hello");

       System.out.println(s1.concat("world"));
       System.out.println(s1);
        s2.append("world");
        s3.append("world");

        System.out.println(s1+" "+s2+" "+s3);
    }
}
