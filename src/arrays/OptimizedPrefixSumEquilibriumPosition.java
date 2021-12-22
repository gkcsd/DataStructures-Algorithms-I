package arrays;

import java.util.Scanner;
//TC- O(n) & AS- O(1)
public class OptimizedPrefixSumEquilibriumPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = getResult(arr);
        System.out.println(res);
    }
    static boolean getResult(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int lSum = 0;

        for(int i = 0; i < n; i++) {
            if(lSum == (sum-arr[i])) {
                return true;
            }

            lSum += arr[i];
            sum -= arr[i];
        }

        return false;
    }
}
