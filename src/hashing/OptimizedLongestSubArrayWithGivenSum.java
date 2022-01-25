package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TC- Θ(n) & AS- O(1)
public class OptimizedLongestSubArrayWithGivenSum {
    static int getResult(int[] arr, int sum) {
        Map<Integer,Integer> m = new HashMap<>();
        int res = 0;
        int prefSum = 0;
        for(int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if(prefSum == sum) {
                res = i+1;
            }
            if(m.containsKey(prefSum) == false) {
                m.put(prefSum, i);
            }
            if(m.containsKey(prefSum-sum)) {
                res = Math.max(res, i-m.get(prefSum-sum));
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
        int sum = 5;

        int res = getResult(arr, sum);
        System.out.println(res);
    }
}
