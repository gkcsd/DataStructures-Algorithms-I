package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedWindowSlidingTechniqueSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = getKConsecutiveElemSum(arr, k);
        System.out.println(res);
    }
    static int getKConsecutiveElemSum(int[] arr, int k) {
        int n = arr.length;
        int currSum = 0;

        for(int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        int maxSum = currSum;

        for(int i = k; i < n; i++) {
            currSum += arr[i] - arr[i-k];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;

    }
}
