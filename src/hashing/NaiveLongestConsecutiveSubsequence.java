package hashing;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class NaiveLongestConsecutiveSubsequence {
    static int longSub(int[] arr) {
        Arrays.sort(arr);
        int res = 1, curr = 1;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]+1) {
                curr++;
            }else if(arr[i] != arr[i-1]) {
                res = Math.max(res, curr);
                curr = 1;
            }
        }
        return Math.max(curr, res);
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
