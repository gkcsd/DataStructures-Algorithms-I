package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TC- Θ(n+m) & AS- O(m+n)
public class OptimizedUnionOfTwoUnsortedArrays {
    static int unionOfTwoUnsortedArrays(int[] arrOne, int[] arrTwo) {
        Set<Integer> s = new HashSet<>();

        for(int x: arrOne) {
            s.add(x);
        }
        for(int x: arrTwo) {
            s.add(x);
        }
        return s.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrOne = new int[n];
        for(int i = 0; i < n; i++) {
            arrOne[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arrTwo = new int[m];
        for(int i = 0; i < m; i++) {
            arrTwo[i] = sc.nextInt();
        }

        int res = unionOfTwoUnsortedArrays(arrOne, arrTwo);
        System.out.println(res);
    }
}
