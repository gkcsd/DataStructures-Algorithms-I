package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TC- O(n) & AS- O(n)
public class OptimizedSumArrayWithGivenSum {
    static boolean getResult(int[] arr, int sum) {
        Set<Integer> s = new HashSet<>();
        int preSum = 0;

        for(int x: arr) {
            preSum += x;

            if(preSum == sum) {
                return true;
            }

            if(s.contains(preSum-sum)) {
                return true;
            }
            s.add(preSum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 22;
        boolean res = getResult(arr, sum);
        System.out.println(res);
    }
}
