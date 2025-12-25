public class multiplyMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5,},
                {3, 5, 6},
                {5, 6, 7}};
        int arr1[][] = {{1, 3, 5,},
                {3, 5, 6},
                {5, 6, 7}};
        int arr2[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i][j] * arr1[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%0(2d ",arr2[i][j]);
            }
            System.out.println();
        }
//        for (int x[] : arr2) {
//            for (int y : x) {
//                System.out.format("%02$d"+y);
//            }
//            System.out.println();
        }
    }

