public class sumofArray {
    public static void main(String[] args) {
        int arr[] = {12, 34, 5, 76, 88, 77};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
