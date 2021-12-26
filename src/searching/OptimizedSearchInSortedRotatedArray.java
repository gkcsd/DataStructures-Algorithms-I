package searching;

import java.util.Scanner;

//TC- O(log(n)) & AS- O(1)
public class OptimizedSearchInSortedRotatedArray {
    static int getSearch(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high) {
            int mid = (high+low)/2;

            if(arr[mid] == x) {
                return mid;
            }

            if(arr[mid] > arr[low]) {
                if(x >= arr[low] && arr[mid] > x) {
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }else {
                if(x > arr[mid] && x <= arr[high]) {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int res = getSearch(arr, x);
        System.out.println(res);
    }
}
