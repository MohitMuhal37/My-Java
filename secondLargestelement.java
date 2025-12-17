public class secondLargestelement {
    public static void main(String[] args) {
        int arr[] = {12, 34, 5, 76, 88, 77, 190, 100, 170, 150, 134};
        int max1 = arr[0];
        int max2 = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.print(max2);
    }
    }

