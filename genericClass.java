class Data<T>{
    private T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }
}

@SuppressWarnings("uncheked")
class MyArray<T extends Number>{
T A[] = (T[]) new Object[10];
int length = 0;

public void append(T v){
    A[length++] = v;
}
public void display(){
    for(int i = 0; i < A.length; i++){
        System.out.println(A[i]);
    }
}
}


class MyArray2 extends MyArray<Integer>{

}
public class genericClass
 {

    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Data<Integer> i = new Data();
        i.setData(10);
        System.out.println(i.getData());

        // MyArray<Integer> it = new MyArray<>();
        // MyArray2 il = new MyArray2();
        // it.append(12);
        // it.append(13);
        // it.append(11);
        // it.append(2);

        // it.display();

        show(new String[]{"Hi","go","bye"});
    }
}
