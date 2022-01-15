package matrix;

//TC- O(n*n) & AS- O(1)
public class OptimizedTransposeOfMatrix {
    static void printTranspose(int[][] arr, int N, int M) {
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < M; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int N = arr.length;
        int M = arr[0].length;

        printTranspose(arr, N, M);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
