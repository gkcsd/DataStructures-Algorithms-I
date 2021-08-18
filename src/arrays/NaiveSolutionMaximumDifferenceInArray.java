package arrays;

import java.util.Scanner;

//O(n^2) & AS- O(1)
public class NaiveSolutionMaximumDifferenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        getDiff(arr);
    }
    static void getDiff(int[] arr) {
        int n =arr.length;

        int res = arr[1] - arr[0];
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        System.out.println(res);
    }
}
