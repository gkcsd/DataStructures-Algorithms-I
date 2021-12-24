package searching;

import java.util.Scanner;

//TC- O(mid) & AS- O(long(n))
public class BinarySearchRecursiveSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int low = 0, high = n-1;
        int res = getResult(arr, low, high, x);
        System.out.println(res);
    }
    static int getResult(int[] arr, int low, int high, int x) {
        if(low > high) {
            return -1;
        }
        int mid = (high+low)/2;

        if(arr[mid] == x) {
            return mid;
        }
        if(arr[mid] > x) {
            return getResult(arr, low, mid-1, x);
        }else {
            return getResult(arr,mid+1, high, x);
        }
    }
}
