package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TC- Θ(n) & AS- O(1)
public class OptimizedFrequenciesOfArrayElement {
    static void getResult(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x: arr) {
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        getResult(arr);
    }
}
