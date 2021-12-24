package searching;

import java.util.Scanner;
//TC- O(log(n)) & AS- O(log(n))
public class RecursiveBSFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int low = 0;
        int high = n-1;
        int res = getFirstOccur(arr, low, high, x);
        System.out.println(res);
    }
    static int getFirstOccur(int[] arr,int low, int high, int x) {
        if(low > high) {
            return -1;
        }
        int mid = (high+low)/2;

        if(arr[mid] > x) {
            return getFirstOccur(arr, low, mid-1, x);
        }else if(arr[mid] < x) {
            return getFirstOccur(arr, mid+1, high, x);
        } else {
            if(mid == 0 || (arr[mid-1] != arr[mid])) {
                return mid;
            }else {
                return getFirstOccur(arr, low, mid-1, x);
            }
        }
    }
}
