class Data<T>{
    private T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }
}

class MyArray<T>{
T A[] = (T[]) new Object[10];
int length = 0;

public void append(T v){
    A[length++] = v;
}
public void display(){
    for(T x : A){
        System.out.println(x);
    }
}
}

public class genericClass
 {
    public static void main(String[] args) {
        Data<Integer> i = new Data();
        i.setData(10);
        System.out.println(i.getData());
    }
}
