package arrays;

import java.util.Scanner;

//O(n*n) & AS- O(1)
public class NaivePrefixSumEquilibriumPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = getResult(arr);
        System.out.println(res);
    }
    static boolean getResult(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int lSum = 0, rSum = 0;
            for(int j = i; j < i; j++) {
                lSum += arr[j];
            }
            for(int j = i+1; j < n; j++) {
                rSum += arr[j];
            }
            if(lSum == rSum) {
                return true;
            }
        }
        return false;
    }
}
