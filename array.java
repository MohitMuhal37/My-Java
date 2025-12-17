public class array {
    public static void main(String[] args){
        int A[] = {12, 23, 45, 65, 76};
        System.out.println(A[1]);

//        traverse on array
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
//        reverse traversing
        for(int i = A.length-1; i >= 0; i--){
            System.out.print(A[i]+" ");
        }
    }
}
