public class deleteArrayElement {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n = 5;
        int index = 2;
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 15;
        arr[3] = 23;
        arr[4] = 1;
        for (int i = index; i < n; i++) {
          arr[i] = arr[i+1];
        }
       for(int i = 0; i < n-1; i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
}
