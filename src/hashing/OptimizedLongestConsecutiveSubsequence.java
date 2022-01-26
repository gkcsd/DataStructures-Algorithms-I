package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TC- Θ(n) O(n)
public class OptimizedLongestConsecutiveSubsequence {
    static int longSub(int[] arr) {
        Set<Integer> s = new HashSet<>();

        for(int x: arr) {
            s.add(x);
        }

        int res = 1;
        for(Integer x: s) {
            if(s.contains(x-1) == false) {
                int curr = 1;
                while(s.contains(x+curr)) {
                    curr++;
                }
                res = Math.max(res,curr);
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

        int res = longSub(arr);
        System.out.println(res);
    }
}
