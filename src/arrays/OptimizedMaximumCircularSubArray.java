package arrays;

import java.util.Scanner;

public class OptimizedMaximumCircularSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        int res = overAllMaxSum(arr);
        System.out.println(res);
    }
    static int normalMaxSum(int arr[], int n) {
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }
    static int overAllMaxSum(int arr[]) {
        int n = arr.length;

        int max_normal = normalMaxSum(arr, n);

        if(max_normal < 0) {
            return max_normal;
        }

        int arr_sum = 0;
        for(int i = 0; i < n; i++) {
            arr_sum += arr[i];
            arr[i] -= arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr, n);

        return Math.max(max_normal, max_circular);
    }
}
