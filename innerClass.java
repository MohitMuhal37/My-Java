class outer{
    int x = 10;

    class inner{
        int y = 20;

        void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }

    void outerDisplay(){
        inner i = new inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}


public class innerClass {
    public static void main(String[] args) {
    outer o = new outer();
    o.outerDisplay();
    }
}
