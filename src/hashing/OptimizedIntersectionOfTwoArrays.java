package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OptimizedIntersectionOfTwoArrays {
    static int intersectionOfTwoArrays(int[] arrOne, int[] arrTwo) {
        Set<Integer> s = new HashSet<>();
        int res = 0;

        for(int x: arrOne) {
            s.add(x);
        }

        for(int x: arrTwo) {
            if(s.contains(x)) {
                res++;
                s.remove(x);
            }
        }
        return res;
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

        int res = intersectionOfTwoArrays(arrOne, arrTwo);
        System.out.println(res);
    }
}
