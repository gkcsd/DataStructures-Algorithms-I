package searching;

import java.util.Scanner;

//TC- O(n*log(sum)) & AS- O(1)
public class BinarySearchAllocateMinimumPages {
    static int getResult(int[] arr, int k) {
        int n = arr.length;
        int sum = 0, mx = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            mx = Math.max(mx, arr[i]);
        }

        int low = mx, high = sum;
        int res = 0;

        while(low <= high) {
            int mid = (high+low)/2;

            if(isFeasible(arr, n, k, mid)) {
                res = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return res;
    }

    static boolean isFeasible(int[] arr, int n, int k, int ans) {
        int stud = 1, sum = 0;

        for(int i = 0; i <n; i++) {
            if(sum+arr[i] > ans) {
                stud++;
                sum = arr[i];
            }else {
                sum += arr[i];
            }
        }
        return (stud <= k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = getResult(arr, k);
        System.out.println(res);
    }
}
