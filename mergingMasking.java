public class mergingMasking {
    public static void main(String[] args) {
        byte a = 9, b = 12;
        byte c;

        c = (byte) (a << 4);
        c = (byte) (c | b);

        System.out.println("in c left side is = "+((c&0b11110000) >> 4));
        System.out.println("in c right side is = "+(c&0b00001111));
        System.out.println(String.format("%s",Integer.toBinaryString(c)));
    }
}