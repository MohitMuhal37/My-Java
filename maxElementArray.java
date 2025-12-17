public class maxElementArray {
    public static void main(String[] args) {
        int arr[] = {12, 34, 5, 76, 88, 77};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
