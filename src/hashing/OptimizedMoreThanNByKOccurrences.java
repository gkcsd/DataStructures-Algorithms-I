package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TC- Θ(n) & AS- O(n)
public class OptimizedMoreThanNByKOccurrences {
    static void getNByKOccurrences(int[] arr, int k) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int x: arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if(e.getValue() > arr.length/k) {
                System.out.print(e.getKey() + " ");
            }
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

        getNByKOccurrences(arr, k);
    }
}
