package matrix;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int m = 3;
        int[][] arr = new int[m][];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter size of the " + (i+1) + " row: " );
            arr[i] = new int[new Scanner(System.in).nextInt()];
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
