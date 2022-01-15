package matrix;

public class MatrixBoundaryTraversal {
    static void printBoundaryElements(int[][] arr, int N, int M) {
        if(N == 1) {
            for(int i = 0; i < M; i++) {
                System.out.print(arr[0][i] + " ");
            }
        }else if(M == 1) {
            for(int i = 0; i < N; i++) {
                System.out.print(arr[i][0] + " ");
            }
        } else {
            for(int i = 0; i < M; i++) {
                System.out.print(arr[0][i] + " ");
            }

            for(int i = 1; i < N; i++) {
                System.out.print(arr[i][N-1] + " ");
            }

            for(int i = M-2; i >= 0; i--) {
                System.out.print(arr[N-1][i] + " ");
            }

            for(int i = N-2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }


    }
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int N = arr.length;
        int M = arr[0].length;

        printBoundaryElements(arr, N, M);
    }
}
