public class reversecopyArray {
    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 76, 5, 89, 76, 55};
        int arr1[] = new int[8];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i] = arr[i];
            }
            System.out.print(arr1[i] +" ");
        }
    }
}