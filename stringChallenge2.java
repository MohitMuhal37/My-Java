public class stringChallenge2{
    public static void main(String[] args) {
        String str = "Max@334*&^Win";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
}