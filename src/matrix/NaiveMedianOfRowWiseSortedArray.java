package matrix;

import java.util.Arrays;

public class NaiveMedianOfRowWiseSortedArray {
    static void getResult(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        int[] arr1 = new int[R*C];
        int index = 0;
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                arr1[index]  = arr[i][j];
                index++;
            }
        }

        Arrays.sort(arr1);
        int low = 0, high = arr1.length-1;
        int x = low+high/2;
        System.out.println(arr1[x]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,10,20}, {15,25,30}, {5,8,40}};

        getResult(arr);
    }
}
