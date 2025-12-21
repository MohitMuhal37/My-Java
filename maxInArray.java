public class maxInArray {

    static int max(int arr[]){
       int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 76, 89, 1543, 345, 1200, 354, 700};
        System.out.println(max(arr));
    }
}
