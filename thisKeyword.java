class Rectangle1{
    int length;
    int breadth;
    public Rectangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void display(){
        System.out.println("Length = "+length);
        System.out.println("breadth = "+breadth);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(10, 4);
        r1.display();
    }
}
