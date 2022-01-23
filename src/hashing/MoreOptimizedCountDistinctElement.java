package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//TC- Θ(n) & AS- O(1)
public class MoreOptimizedCountDistinctElement {
    static int getResult(Integer arr[]) {
        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        return h.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = getResult(arr);
        System.out.println(res);
    }
}
