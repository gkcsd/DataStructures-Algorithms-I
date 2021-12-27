package searching;

import java.util.Scanner;

//O(n*n) & AS- O(1)
public class OptimizedFindTripletsSum {
    static boolean getTripletSum(int[] arr, int x) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(isPair(arr, i+1, n-1, x-arr[i])) {
                return true;
            }
        }
        return false;
    }

    static boolean isPair(int[] arr, int left, int right, int sum) {
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

        boolean res = getTripletSum(arr, x);
        System.out.println(res);
    }
}
