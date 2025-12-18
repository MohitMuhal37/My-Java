public class arrayRightrotate {
    public static void main(String[] args) {
        int arr[] = {12, 34, 3, 56, 76, 88, 56, 23, 234, 987};
        int last = arr[arr.length - 1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
//            System.out.println("");
        }
    }
}