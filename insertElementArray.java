public class insertElementArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n = 6;
        int val = 18;
        int index = 2;
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 15;
        arr[3] = 23;
        arr[4] = 1;
        arr[5] = 13;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = n; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = val;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
