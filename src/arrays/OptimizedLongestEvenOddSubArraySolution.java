package arrays;

import java.util.Scanner;

//TC- O(n) & As- O(1)
public class OptimizedLongestEvenOddSubArraySolution {
    static int getMaxEvenOddSubArray(int[] arr) {
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for(int i = 1; i < n; i++) {
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)) {
                curr++;
                res = Math.max(curr,res);
            }else {
                curr = 1;
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
        int res = getMaxEvenOddSubArray(arr);
        System.out.println(res);
    }
}
