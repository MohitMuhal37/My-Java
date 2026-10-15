public class multiplyMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,60},
                {1,3,70},
                {1,4,75},
            {1,5,80},
        {1,6,90}};
        int arr1[][] = {{1, 1,1,1,1},
                {2,3,4,5,6},
                {60,70,75,80,90}};
        int arr2[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = 0;
                for(int k = 0; k < 5; k++){
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
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

