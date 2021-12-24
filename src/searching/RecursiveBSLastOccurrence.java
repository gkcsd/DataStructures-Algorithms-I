package searching;

import java.util.Scanner;

//TC- O(log(n)) & AS- O(log(n))
public class RecursiveBSLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int low = 0, high = n-1;
        int res = getLastOccur(arr, low, high, x);
        System.out.println(res);
    }
    static int getLastOccur(int[] arr, int low, int high, int x) {
        int n = arr.length;

        if(low > high) {
            return -1;
        }

        int mid = (high+low)/2;

        if(arr[mid] > x) {
            return getLastOccur(arr, low, mid-1, x);
        }else if(arr[mid] < x) {
            return getLastOccur(arr, mid+1, high, x);
        }else {
            if(mid == (n-1) || arr[mid] != arr[mid+1]) {
                return mid;
            }else {
                return getLastOccur(arr, mid+1, high, x);
            }
        }

    }
}
