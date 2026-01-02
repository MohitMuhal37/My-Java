class Data<T>{
    private T obj;

    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
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
