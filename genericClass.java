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
class MyArray<T>{
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

public class genericClass
 {
    public static void main(String[] args) {
        Data<Integer> i = new Data();
        i.setData(10);
        System.out.println(i.getData());

        MyArray<Integer> it = new MyArray<>();
        it.append(12);
        it.append(13);
        it.append(11);
        it.append(2);

        it.display();
    }
}
