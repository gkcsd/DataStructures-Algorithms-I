package matrix;

import java.util.Scanner;

public class MatrixTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
