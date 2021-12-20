package arrays;

import java.util.Scanner;

//TC- O((n-k)*k) & AS- O(1)
public class NaiveWindowSlidingTechniqueSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        int res = getMaxConsWindowSlide(arr, k);
        System.out.println(res);
    }
    static int getMaxConsWindowSlide(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; (i+k-1) < n; i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += arr[i+j];
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
