package hashing;

import java.util.Scanner;

//TC- Θ(n*n) & AS- O(1)
public class NaiveSolutionLongestSubArrayWithGivenSum {
    static int getResult(int[] arr, int sum) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for(int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if(currSum == sum) {
                    res = Math.max(res, j-i+1);
                }
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
        int sum = 5;

        int res = getResult(arr, sum);
        System.out.println(res);
    }
}
