public class printUnicode {
    public static void main(String[] args) {
        for(char c = 0x0370; c <= 0x03ff; c++){
            System.out.print(c + " ");
        }
    }
}
