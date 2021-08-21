package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedMaximumSubArraySolution {
    static int maxSubArray(int[] arr) {
        int n =arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res,maxEnding);
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
        int res = maxSubArray(arr);
        System.out.println(res);
    }
}
