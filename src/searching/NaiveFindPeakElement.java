package searching;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class NaiveFindPeakElement {
    static int getPeakElem(int[] arr) {
        int n = arr.length;

        if(n == 1) return arr[0];

        if(arr[0] >= arr[1]) return arr[0];

        if(arr[n-1] >= arr[n-2]) return arr[n-1];

        for(int i = 1; i < n-1; i++) {
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return arr[i];
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
        int res = getPeakElem(arr);
        System.out.println(res);
    }
}
