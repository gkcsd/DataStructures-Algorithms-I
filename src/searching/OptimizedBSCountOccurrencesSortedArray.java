package searching;

import java.util.Scanner;

//TC- O(log(n)) & AS- O(1)
public class OptimizedBSCountOccurrencesSortedArray {
    static int firstOccur(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high) {
            int mid = (high+low)/2;

            if(arr[mid] > x) {
                high = mid-1;
            }else if(arr[mid] < x) {
                low = mid+1;
            }else {
                if(mid == 0 || (arr[mid-1] != arr[mid])) {
                    return mid;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    static int lastOccur(int[] arr, int x) {
        int n = arr.length, low = 0, high = n-1;

        while(low <= high) {
            int mid = (high+low)/2;

            if(arr[mid] > x) {
                high = mid-1;
            }else if(arr[mid] < x) {
                low = mid+1;
            }else {
                if((mid == n-1) || (arr[mid] != arr[mid+1])) {
                    return mid;
                }else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    static int getCountOccur(int[] arr, int x) {
        int n = arr.length;
        int first = firstOccur(arr, x);

        if(first == -1) {
            return 0;
        }else {
            return (lastOccur(arr, x) - first + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = getCountOccur(arr, x);
        System.out.println(res);
    }
}
