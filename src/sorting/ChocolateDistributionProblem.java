package sorting;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class ChocolateDistributionProblem {
    static int minDiff(int[] arr, int m) {
        Arrays.sort(arr);
        int res = arr[m-1] - arr[0];

        for(int i = 1; (i+m-1) < arr.length; i++) {
            res = Math.min(res, arr[i+m-1] - arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        int res = minDiff(arr, m);
        System.out.println(res);
    }
}
