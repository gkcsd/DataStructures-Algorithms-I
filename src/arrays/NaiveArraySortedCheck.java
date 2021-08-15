package arrays;

import java.util.Scanner;

//TC- 0(n^2) AS- 0(1)
public class NaiveArraySortedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = isSorted(arr);
        System.out.println(res);
    }
    static boolean isSorted(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
