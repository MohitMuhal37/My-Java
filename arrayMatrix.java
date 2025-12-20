public class arrayMatrix {
    public static void main(String[] args) {
        int arr[][] = new int [3][3];
//        int arr1[][] = new int [3][3];
        int arr1[][] = {{12, 34, 5},
                        {12,54, 5},
                        {54, 67, 87}};
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
