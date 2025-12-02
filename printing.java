class printing{
    public static void main(String[] args) {
        int x = 10, y = 20;
        float f = 45.87f;
        System.out.println(x + y + " sum");
        System.out.println("sum "+x + y);

        // Format string
        System.out.printf("hello %d \n", x);
        System.out.printf("hello %1$d %1$d %1$d \n", x);
        System.out.printf("hello %f", f);
    }
}