package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TC- O(n) & AS- O(k)
public class OptimizedCountDistinctElementInEveryWindow {
    static void countWin(int[] arr, int k) {
        Map<Integer,Integer> hm = new HashMap<>(k);

        for(int i = 0; i < k; i++) {
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(hm.size());

        for(int i = k; i < arr.length; i++) {
            if(hm.get(arr[i-k]) == 1) {
                hm.remove(arr[i-k]);
            } else {
                hm.put(arr[i-k], hm.get(arr[i-k])-1);
            }

            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);

            System.out.println(hm.size());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        countWin(arr, k);
    }
}
