package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class WindowSlidingTechniqueSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = sc.nextInt();
        boolean res = getResult(arr, k, sum);
        System.out.println(res);
    }
    static boolean getResult(int[] arr, int k, int sum) {
        int n = arr.length;
        int currSum = 0;

        for(int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        for(int i = k; i < n; i++) {
            currSum += arr[i] - arr[i-k];

            if(currSum == sum) {
                return true;
            }
        }

        return false;
    }
}
