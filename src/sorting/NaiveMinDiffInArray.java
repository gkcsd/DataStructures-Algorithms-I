package sorting;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class NaiveMinDiffInArray {
    static int getResult(int[] arr) {
        int n = arr.length , res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
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
