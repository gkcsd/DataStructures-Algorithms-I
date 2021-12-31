package searching;

import java.util.Scanner;

public class NaiveAllocateMinimumPages {
    static int getAllocatedMinPages(int[] arr,int n, int k) {

        if(k == 1) return getSum(arr, 0, n-1);

        if(n == 1) return arr[0];

        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            res = Math.min(res, Math.max(getAllocatedMinPages(arr, i, k-1), getSum(arr, i, n-1)));
        }

        return res;
    }

    static int getSum(int[] arr, int b, int e) {
        int sum = 0;
        for(int i = b; i <=e; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int size = arr.length;

        int res = getAllocatedMinPages(arr, size, k);
        System.out.println(res);
    }
}
