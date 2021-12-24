package searching;

import java.util.Scanner;
//TC- O(log(n)) & AS- O(1)
public class BinarySearchProgramOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int res = getResult(arr, x);
        System.out.println(res);
    }
    static int getResult(int[] arr, int x) {
        int n = arr.length, low = 0, high = n-1;

        while(low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] == x) {
                return mid;
            }

            if(arr[mid] > x) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }

        return -1;
    }
}
