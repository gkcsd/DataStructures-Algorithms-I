package searching;

import java.util.Scanner;

//TC- O(log(n)) & AS- O(1)
public class OptimizedFindPeakElement {
    static int getPeakElem(int[] arr) {
        int n = arr.length;
        int low = 0, high = n-1;

        while(low <= high) {
            int mid = (high+low)/2;

            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid])) {
                return mid;
            }

            if(mid > 0 && arr[mid-1] >= arr[mid]) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)  {
            arr[i] = sc.nextInt();
        }
        int res = getPeakElem(arr);
        System.out.println(res);
    }
}
