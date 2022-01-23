package hashing;

import java.util.HashSet;
import java.util.Scanner;

//TC- Θ(n) & AS- O(n)
public class OptimizedCountDistinctElement {
    static int getResult(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }
        return h.size();
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
