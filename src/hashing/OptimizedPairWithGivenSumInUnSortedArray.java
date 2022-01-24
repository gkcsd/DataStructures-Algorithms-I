package hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TC- O(n) & AS- O(n)
public class OptimizedPairWithGivenSumInUnSortedArray {
    static boolean getResult(int[] arr, int sum) {
        Set<Integer> s = new HashSet<>();
        for(int x: arr) {
            if(s.contains(sum-x)) {
                return true;
            }else {
                s.add(x);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 13;
        boolean res = getResult(arr, sum);
        System.out.println(res);
    }
}
