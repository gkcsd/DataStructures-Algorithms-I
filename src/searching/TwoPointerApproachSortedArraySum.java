package searching;

import java.util.Scanner;

public class TwoPointerApproachSortedArraySum {
    static boolean getMatchingSum(int[] arr, int sum) {
        int n = arr.length, left = 0, right = n-1;

        while(left < right) {
            int currSum = arr[left] + arr[right];

            if(currSum == sum) {
                return true;
            }

            if(currSum > sum) {
                right--;
            }else {
                left++;
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
        int x = sc.nextInt();

        boolean res = getMatchingSum(arr, x);
        System.out.println(res);
    }
}
