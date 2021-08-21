package arrays;

import java.util.Scanner;

//TC- (n^2) & AS- O(1)
public class NaiveMaximumSumSubArraySolution {
    static int getMaxSumOfSubArray(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        for(int i = 0; i < n; i++) {
            int curr = 0;
            for(int j = i; j < n; j++) {
                curr = curr + arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int res = getMaxSumOfSubArray(arr);
        System.out.println(res);
    }
}
