package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumAppearingElementPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int[] R = new int[n];
        for(int i = 0; i < n; i++) {
            L[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            R[i] = sc.nextInt();
        }

        int res = maxGet(L, R);
        System.out.println(res);
    }
    static int maxGet(int[] L, int[] R) {
        int n = L.length, res = 0;
        int[] arr = new int[1000];

        for(int i = 0; i < n; i++) {
            arr[L[i]]++;
            arr[R[i] + 1]--;
        }
        int maxVal = arr[0];

        for(int i = 1; i < 1000; i++) {
            arr[i] += arr[i-1];
            if(maxVal < arr[i]) {
                maxVal = arr[i];
                res = i;
            }
        }
        return res;
    }
}
