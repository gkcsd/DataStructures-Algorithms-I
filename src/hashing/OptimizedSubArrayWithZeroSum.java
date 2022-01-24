package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TC- O(n) & AS- O(n)
public class OptimizedSubArrayWithZeroSum {
    static boolean getResult(int[] arr) {
        Set<Integer> s = new HashSet<>();
        int preSum = 0;

        for(int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if(s.contains(preSum)) {
                return true;
            }
            if(preSum == 0) {
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

        boolean res = getResult(arr);
        System.out.println(res);
    }
}
