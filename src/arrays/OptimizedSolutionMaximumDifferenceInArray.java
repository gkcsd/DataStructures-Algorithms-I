package arrays;

import java.util.Scanner;
//TC- 0(n) & AS- 0(1)
public class OptimizedSolutionMaximumDifferenceInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = getDifference(arr);
        System.out.println(res);
    }
    static int getDifference(int[] arr) {
        int n = arr.length;
        int res = arr[1] - arr[0], minValue = arr[0];

        for(int j = 1; j < n; j++) {
            res = Math.max(res, arr[j]-minValue);
            minValue = Math.min(minValue, arr[j]);
        }
        return res;
    }
}
