public class copyArray {
    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 76, 5};
        int arr1[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }
}