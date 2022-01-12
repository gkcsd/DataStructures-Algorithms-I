package sorting;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class OptimizedMinDiffInArray {
    static int getResult(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            res = Math.min(res, arr[i] - arr[i-1]);
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

        int res = getResult(arr);
        System.out.println(res);
    }
}
