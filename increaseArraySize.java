public class increaseArraySize {
    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 76, 5, 89, 76, 55};
        int arr1[] = new int[arr.length * 2];
            System.out.print(arr.length);

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        arr = arr1;
        System.out.println(arr.length);
    }
}
