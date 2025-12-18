public class arrayleftRotate {
    public static void main(String[] args) {
        int arr [] = {12, 34, 3, 56, 76, 88, 56, 23, 234, 987};
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
//            System.out.println("");
        }
    }
}
