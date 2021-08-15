package arrays;

import java.util.Scanner;

//TC- 0(n) AS- 0(1)
public class OptimizedArraySortedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = isSorted(arr);
        System.out.println(res);
    }
    static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
}
