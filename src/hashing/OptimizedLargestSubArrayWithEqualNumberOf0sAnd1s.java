package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TC- Θ(n) & AS- O(n)
public class OptimizedLargestSubArrayWithEqualNumberOf0sAnd1s {
    static int getResult(int[] arr) {
        Map<Integer, Integer> hM
                = new HashMap<>();

        int prefSum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            if (prefSum == 0) {
                res = i + 1;
            }

            if(hM.containsKey(prefSum) == false) {
                hM.put(prefSum, i);
            }

            if (hM.containsKey(prefSum)) {
                res = Math.max(res, i- hM.get(prefSum));
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
