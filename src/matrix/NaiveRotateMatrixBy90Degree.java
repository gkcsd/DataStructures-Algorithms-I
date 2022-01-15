package matrix;

//TC- O(n*n) & AS- O(n*n)
public class NaiveRotateMatrixBy90Degree {
    static void printTranspose(int[][] arr) {
        int N = arr.length;
        int M = arr[0].length;

        int[][] temp = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                temp[N-j-1][i] = arr[i][j];
            }
        }


        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int N = arr.length;
        int M = arr[0].length;

        printTranspose(arr);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
