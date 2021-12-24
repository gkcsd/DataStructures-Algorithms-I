package searching;

import java.util.Scanner;
//TC- O(log(n)) & As- O(1)
public class IterativeBSFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int res = getFirstOccur(arr, x);
        System.out.println(res);
    }
    static int getFirstOccur(int[] arr, int x) {
        int n = arr.length;
        int low = 0;
        int high = n;

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
}
