public class multiplyMatrix {
    public static void main(String[] args) {
        int arr[][] = {{12, 3, 5,},
                {3, 5, 6},
                {5, 6, 7}};
        int arr1[][] = {{12, 3, 5,},
                {3, 5, 6},
                {5, 6, 7}};
        int arr2[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i][j] * arr1[i][j];
            }
        }
        for (int x[] : arr2) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
