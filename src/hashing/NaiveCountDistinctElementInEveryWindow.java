package hashing;

import java.util.Scanner;

public class NaiveCountDistinctElementInEveryWindow {
    static void countWin(int[] arr, int k) {
        for(int i = 0; i <= arr.length-k; i++) {
            int count = 0;
            for(int j = 0; j < k; j++) {
                boolean flag = false;
                for(int p = 0; p < j; p++) {
                    if(arr[i+j] == arr[i+p]) {
                        flag = true;
                        break;
                    }
                }
                if(flag == false) {
                    count++;
                }
            }
            System.out.println("Window "+ (i+1) + ": " + count + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        countWin(arr, k);
    }
}
