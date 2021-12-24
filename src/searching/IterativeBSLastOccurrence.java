package searching;

import java.util.Scanner;

//TC- O(log(n)) & AS- O(1)
public class IterativeBSLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = getLastOccur(arr, x);
        System.out.println(res);
    }
    static int getLastOccur(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n-1;

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
}
